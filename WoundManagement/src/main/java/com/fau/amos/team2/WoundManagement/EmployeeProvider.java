package com.fau.amos.team2.WoundManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;

public class EmployeeProvider {

	private static EmployeeProvider instance;
	private final JPAContainer<Employee> container;
	
	private EmployeeProvider() {
		container = JPAContainerFactory.make(Employee.class, Constants.PERSISTANCE_UNIT);
	}
	
	public static EmployeeProvider getInstance() {
		if(instance == null)
			return instance = new EmployeeProvider();
		return instance;
	}
	
	public void add(Employee e) {
		container.addEntity(e);
	}
	public boolean contains(Employee e) { 
		return container.getEntityProvider().getEntityManager().contains(e);
	}
	public List<Employee> get() { 
		Map<String,Object> map = 
				container.getEntityProvider().getEntityManager().getProperties();
		List<Employee> list = new ArrayList<Employee>();
		
		for(Object obj : map.values()) {
        	Employee emp = (Employee)obj;
        	list.add(emp);
        }
		return list;
	}
}

package com.fau.amos.team2.WoundManagement;

//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;

import com.fau.amos.team2.WoundManagement.model.Constants;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;
//import com.vaadin.addon.jpacontainer.provider.CachingMutableLocalEntityProvider;

public class EmployeeProvider {

	private static EmployeeProvider instance;
	
	//private EntityManagerFactory entityManagerFactory;
	//private EntityManager entityManager;     
	//private CachingMutableLocalEntityProvider<Employee> entityProvider;
	private JPAContainer<Employee> employees;
	
	private EmployeeProvider() {
		/*entityManagerFactory = Persistence.createEntityManagerFactory(Constants.PERSISTANCE_UNIT);
		entityManager = entityManagerFactory.createEntityManager();   
		entityProvider = new CachingMutableLocalEntityProvider<Employee>(Employee.class, entityManager);
		employees = new JPAContainer<Employee> (Employee.class);
		employees.setEntityProvider(entityProvider);*/
		employees = JPAContainerFactory.make(Employee.class, Constants.PERSISTANCE_UNIT);
	}
	
	public static EmployeeProvider getInstance() {
		if(instance == null) {
			instance = new EmployeeProvider();
		}
		return instance;
	}
	
	public Object add(Employee employee) {
		return employees.addEntity(employee);
	}
	
	public JPAContainer<Employee> getAll() {
		return employees;
	}
	
	public Employee getByID(Object id) { 
		return employees.getItem(id).getEntity();
	}
	
	public Employee getByFirstName(String str) {
		Employee tmp;
		
		Object[] ids = employees.getItemIds().toArray();
		
		for(int i = 0; i < employees.size(); ++i) {
			tmp = employees.getItem(ids[i]).getEntity();
			
			if(tmp.getFirstName().equals(str)) {
				return tmp;
			}
		}
		return null;
	}
	
	public boolean getLogin(String username, String password) {		
		Employee tmp = null;
		Object[] ids = employees.getItemIds().toArray();
		
		for(int i = 0; i < ids.length; ++i) {
			tmp = employees.getItem(ids[i]).getEntity();
			
			if(tmp.getAbbreviation().equals(username)) {
				int code = Integer.parseInt(password);
				if(tmp.getQualificationNumber() == code) {
					return true;
				}
			}
		}
		return false;
	}
	
	public Object getLoginID(String username, String password) {		
		Employee tmp = null;
		Object[] ids = employees.getItemIds().toArray();
		
		for(int i = 0; i < ids.length; ++i) {
			tmp = employees.getItem(ids[i]).getEntity();
			
			if(tmp.getAbbreviation().equals(username)) {
				int code = Integer.parseInt(password);
				if(tmp.getQualificationNumber() == code) {
					return tmp.getId();
				}
			}
		}
		return null;
	}
}

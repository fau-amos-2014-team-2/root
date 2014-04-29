package com.fau.amos.team2.WoundManagement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Constants;
import model.Employee;

import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.provider.CachingMutableLocalEntityProvider;

public class EmployeeProvider {

	private static EmployeeProvider instance;
	
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;     
	private CachingMutableLocalEntityProvider<Employee> entityProvider;
	private JPAContainer<Employee> employees;
	
	private EmployeeProvider() {
		entityManagerFactory = Persistence.createEntityManagerFactory(Constants.PERSISTANCE_UNIT);
		entityManager = entityManagerFactory.createEntityManager();   
		entityProvider = new CachingMutableLocalEntityProvider<Employee>(Employee.class, entityManager);
		employees = new JPAContainer<Employee> (Employee.class);
		employees.setEntityProvider(entityProvider);
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
}

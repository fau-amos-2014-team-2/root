package com.fau.amos.team2.WoundManagement.provider;

import com.fau.amos.team2.WoundManagement.model.BusinessObject;
import com.fau.amos.team2.WoundManagement.model.Constants;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;

/**
 * <code>EmployeeProvider</code> manages the access to the
 * Database 'employee', which handles objects
 * of the type <code>Employee</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.Employee
 * @author Stefan, Betz
 * */
public class EmployeeProvider<T extends BusinessObject> extends ObjectProvider<T> {

	private static EmployeeProvider<Employee> instance;
	
	public EmployeeProvider(Class<T> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>EmployeeProvider</code> 
	 * */
	public static EmployeeProvider<? extends BusinessObject> getInstance() {
		if(instance == null) {
			instance = new EmployeeProvider<Employee>(Employee.class);
		}
		return instance;
	}
	
	
	/**
	 * Get the first Employee with 
	 * @param str - firstName of the Employee
	 * @return instance of the first according Employee, or null
	 */
	public Employee getByFirstName(String str) {
		Employee tmp;
		
		Object[] ids = container.getItemIds().toArray();
		
		for(int i = 0; i < container.size(); ++i) {
			tmp = (Employee) container.getItem(ids[i]).getEntity();
			
			if(tmp.getFirstName().equals(str)) {
				return tmp;
			}
		}
		return null;
	}
	/**
	 * Tries to login with the credentials according to the Database
	 * 
	 * @param username
	 * @param password
	 * @return true if login successful, false otherwise
	 */
	public boolean getLogin(String username, String password) {		
		Employee tmp = null;
		Object[] ids = container.getItemIds().toArray();
		
		for(int i = 0; i < ids.length; ++i) {
			tmp = (Employee) container.getItem(ids[i]).getEntity();
			
			if(tmp.getAbbreviation().equals(username)) {
				int code = Integer.parseInt(password);
				if(tmp.getQualificationNumber() == code) {
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * Get the id of the logged in Employee
	 * 
	 * @param username
	 * @param password
	 * @return id of the logged in Employee
	 */
	public Object getLoginID(String username, String password) {		
		Employee tmp = null;
		Object[] ids = container.getItemIds().toArray();
		
		for(int i = 0; i < ids.length; ++i) {
			tmp = (Employee) container.getItem(ids[i]).getEntity();
			
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

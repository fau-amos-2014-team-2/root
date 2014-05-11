package com.fau.amos.team2.WoundManagement.provider;

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
public class EmployeeProvider {

	private static EmployeeProvider instance;
	
	private JPAContainer<Employee> employees;
	
	/**
	 * Constructs an empty <code>JPAContainer<Employee></code>
	 * and in this context an empty Database with the
	 * credentials of <code>Constants.PERSISTANCE_UNIT</code>
	 * 
	 * @see com.fau.amos.team2.WoundManagement.model.Constants
	 * @see persistence.xml
	 */
	private EmployeeProvider() {
		employees = JPAContainerFactory.make(Employee.class, Constants.PERSISTANCE_UNIT);
	}
	
	/**
	 * @return The instance of <code>EmployeeProvider</code> 
	 * */
	public static EmployeeProvider getInstance() {
		if(instance == null) {
			instance = new EmployeeProvider();
		}
		return instance;
	}
	
	/**
	 * Adds an Employee to the Database
	 * 
	 * @param Employee
	 * @return the Id of the inserted Employee
	 */
	public Object add(Employee employee) {
		return employees.addEntity(employee);
	}
	
	/**
	 * Get all Employees from the Database
	 * 
	 * @return JPAContainer containing all Employees
	 */
	public JPAContainer<Employee> getAll() {
		return employees;
	}
	/**
	 * Get the Employee with id from the Database 
	 * 
	 * @param id - The unique id of an Employee
	 * @return instance of the according Employee, or null
	 */
	public Employee getByID(Object id) { 
		return employees.getItem(id).getEntity();
	}
	
	/**
	 * Get the first Employee with 
	 * @param str - firstName of the Employee
	 * @return instance of the first according Employee, or null
	 */
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
	/**
	 * Tries to login with the credentials according to the Database
	 * 
	 * @param username
	 * @param password
	 * @return true if login successful, false otherwise
	 */
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
	/**
	 * Get the id of the logged in Employee
	 * 
	 * @param username
	 * @param password
	 * @return id of the logged in Employee
	 */
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

package com.fau.amos.team2.WoundManagement.provider;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.provider.exceptions.DuplicateEmployeeException;

/**
 * <code>EmployeeProvider</code> manages the access to the
 * Database 'employee', which handles objects
 * of the type <code>Employee</code>
 * 
 * @see com.fau.amos.team2.WoundManagement.Employee
 * @author Stefan, Betz
 * */
public class EmployeeProvider extends ObjectProvider<Employee> {

	private static EmployeeProvider instance;
	
	public EmployeeProvider(Class<Employee> type) {
		super(type);
	}
	
	/**
	 * @return The instance of <code>EmployeeProvider</code> 
	 * */
	public static EmployeeProvider getInstance() {
		if(instance == null) {
			instance = new EmployeeProvider(Employee.class);
		}
		return instance;
	}
	
	public List<Employee> getAllItems() {
		EntityManager em = container.getEntityProvider().getEntityManager();
		TypedQuery<Employee> query = em.createNamedQuery("Employee.findAll", Employee.class);
		return query.getResultList();
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
	public Employee getEmployeeByUsernameAndPassword(String username, String password) {
		int passwordInteger;
		
		try {
			passwordInteger = Integer.parseInt(password);
		}
		catch (NumberFormatException e) {
			return null;
		}
		
		EntityManager em = container.getEntityProvider().getEntityManager();
		
		TypedQuery<Employee> query = em.createNamedQuery("Employee.findByUsernameAndPassword", Employee.class);
		query.setParameter("username", username);
		query.setParameter("password", passwordInteger);
		
		try {
			Employee employee = query.getSingleResult();
			return employee;
		}
		catch (NoResultException ex) {
			return null;
		}
		catch (NonUniqueResultException ex) {
			// WTF?
			return null;
		}
	}
	
	public Employee getEmployeeByUsername(String username) {
		EntityManager em = container.getEntityProvider().getEntityManager();
		
		TypedQuery<Employee> query = em.createNamedQuery("Employee.findByUsername", Employee.class);
		query.setParameter("username", username);
		
		try {
			Employee employee = query.getSingleResult();
			return employee;
		}
		catch (NoResultException ex) {
			return null;
		}
		catch (NonUniqueResultException ex) {
			// WTF?
			return null;
		}
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
	
	public void createEmployee(Employee employee) throws DuplicateEmployeeException {
		if (getEmployeeByUsername(employee.getAbbreviation()) == null) {
			add(employee);
		}
		
		throw new DuplicateEmployeeException(employee.getAbbreviation());
	}

	public void updateEmployee(Employee employee) {
		EntityManager em = container.getEntityProvider().getEntityManager();
		
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
	}
	
	public void deleteAll() {
		EntityManager em = container.getEntityProvider().getEntityManager();
		em.getTransaction().begin();
		em.createNamedQuery("Employee.deleteAll").executeUpdate();
		em.getTransaction().commit();
	}
}
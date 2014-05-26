package com.fau.amos.team2.WoundManagement.provider;

import javax.persistence.EntityManager;

import com.fau.amos.team2.WoundManagement.model.BusinessObject;
import com.vaadin.addon.jpacontainer.JPAContainer;

/**
 * <code>ObjectProvider</code> manages the access to the
 * Database.
 * 
 * @see com.fau.amos.team2.WoundManagement.Employee
 * @author Stefan, Betz
 * */
public class ObjectProvider<T extends BusinessObject> {
	
	protected JPAContainer<T> container;
	protected ConnectionProvider<T> connection;

	/**
	 * Constructs an empty <code>JPAContainer<Employee></code>
	 * and in this context an empty Database with the
	 * credentials of <code>Constants.PERSISTANCE_UNIT</code>
	 * 
	 * @see com.fau.amos.team2.WoundManagement.model.Constants
	 * @see persistence.xml
	 */
	public ObjectProvider(Class<T> type) {
		connection = new ConnectionProvider<T>(type);
		container = connection.getContainer();
	}

	/**
	 * Adds an Employee to the Database
	 * 
	 * @param Employee
	 * @return the Id of the inserted Employee
	 */
	public void add(T object) {
		update(object);
		
		container.addEntity(object);
	}
	
	public void update(T object) {
		EntityManager em = container.getEntityProvider().getEntityManager();
		
		em.getTransaction().begin();
		em.persist(object);
		em.getTransaction().commit();
	}
	
	/**
	 * Get all Employees from the Database
	 * 
	 * @return JPAContainer containing all Employees
	 */
	public JPAContainer<T> getAll() {
		return container;
	}
	/**
	 * Get the Employee with id from the Database 
	 * 
	 * @param id - The unique id of an Employee
	 * @return instance of the according Employee, or null
	 */
	public T getByID(Object id) { 
		return container.getItem(id).getEntity();
	}
	
	public boolean contains(Object objectId) { 
		return container.containsId(objectId);
	}
}

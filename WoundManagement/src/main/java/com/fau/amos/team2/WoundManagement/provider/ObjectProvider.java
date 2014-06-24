package com.fau.amos.team2.WoundManagement.provider;

import javax.persistence.EntityManager;

import com.fau.amos.team2.WoundManagement.model.BusinessObject;
import com.vaadin.addon.jpacontainer.JPAContainer;

/**
 * <code>ObjectProvider</code> manages the access to the
 * Database.
 * 
 * */
public class ObjectProvider<T extends BusinessObject> {
	
	protected JPAContainer<T> container;
	protected ConnectionProvider<T> connection;

	/**
	 * Constructs an empty <code>JPAContainer<T></code>
	 * and in this context an empty database with the
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
	 * Adds an object to the database
	 * 
	 * @param T
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
	 * Get all T objects from the database
	 * 
	 * @return JPAContainer containing all T objects
	 */
	public JPAContainer<T> getAll() {
		return container;
	}
	/**
	 * Get the T object with id from the database 
	 * 
	 * @param id - The unique id of a T object
	 * @return instance of the according object, or null
	 */
	public T getByID(Object id) { 
		return container.getItem(id).getEntity();
	}
	
	public boolean contains(Object objectId) { 
		return container.containsId(objectId);
	}
}

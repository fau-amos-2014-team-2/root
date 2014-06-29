package com.fau.amos.team2.WoundManagement.provider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fau.amos.team2.WoundManagement.model.BusinessObject;
import com.fau.amos.team2.WoundManagement.model.Constants;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.provider.CachingMutableLocalEntityProvider;

public class ConnectionProvider<T extends BusinessObject> {

	protected Class<T> type;
	
	protected EntityManager entityManager;
	protected EntityManagerFactory entityManagerFactory;
	
	protected JPAContainer<T> container;
	protected CachingMutableLocalEntityProvider<T> entityProvider;
	
	protected static boolean loggedInOnce = false;
	
	public ConnectionProvider(Class<T> c) 
	{
		type = c;
		
		HashMap<String, String> properties = new HashMap<String,String>();
		
		// Connect to Database via Data from Environment
		// Is no DatabaseConnecitonInfo exists default to Local
		// Just change data once
		ConnectionType connectionType = Environment.getConnectionType();
		if(connectionType == null) {
			connectionType = ConnectionType.LOCAL;
			Environment.setConnectionType(connectionType);
		} else if(!loggedInOnce){
			properties.put("javax.persistence.jdbc.user",
					connectionType.getUser());
			properties.put("javax.persistence.jdbc.password",
					connectionType.getPassword());
			properties.put("javax.persistence.jdbc.url",
					connectionType.getUrl());
			loggedInOnce = false;
		}
		
		entityManagerFactory = 
				Persistence.createEntityManagerFactory(Constants.PERSISTANCE_UNIT, 
						properties);

		entityManager = entityManagerFactory.createEntityManager();
		
		entityProvider =  new CachingMutableLocalEntityProvider<T>(type, entityManager);
	}
	
	public JPAContainer<T> getContainer()
	{
		if(container == null) {
			container = new JPAContainer<T> (type);
			container.setEntityProvider(entityProvider);
		}
		return container;
	}
	
	@SuppressWarnings("unused")
	private String getPassword() throws Exception { 
		String configFile = "config.pwd";
		BufferedReader b;
		try {
			b = new BufferedReader(new FileReader(configFile));
			String str = b.readLine();
			b.close();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			throw new Exception("You need to make sure the file "
					+ "'config.pwd' exists in folder 'WoundManagement"
					+ "' and the password for DB-user "
					+ "is written in it!");
		}
	}
}

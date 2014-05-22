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
	
	public ConnectionProvider(Class<T> c) 
	{
		type = c;
		
		HashMap<String, String> properties = new HashMap<String,String>();
		properties.put("javax.persistence.jdbc.password", getPassword("config.pwd"));
		
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
	
	private String getPassword(String configFile) { 
		
		BufferedReader b;
		try {
			b = new BufferedReader(new FileReader(configFile));
			String str = b.readLine();
			b.close();
			return str;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
}

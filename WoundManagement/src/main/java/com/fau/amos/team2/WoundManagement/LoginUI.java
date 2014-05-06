package com.fau.amos.team2.WoundManagement;

/*
import javax.naming.Context;
import javax.naming.InitialContext;

import org.eclipse.persistence.config.SessionCustomizer;
import org.eclipse.persistence.sessions.DatabaseLogin;
import org.eclipse.persistence.sessions.JNDIConnector;
import org.eclipse.persistence.sessions.Session;
import org.eclipse.persistence.sessions.server.ServerSession;*/

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.model.Ward;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.provider.WardProvider;
import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

/**
 * The UI's "main" class
 * 
 * @author ???
 */
@SuppressWarnings("serial")
@Widgetset("com.fau.amos.team2.WoundManagement.gwt.AppWidgetSet")
@Theme("touchkit")
public class LoginUI extends UI {

	// Provide to initialize objects just once; before the instance exists
	private static Employee testUser1 = new Employee();
	private static Employee testUser2 = new Employee();
	private static Employee testUser3 = new Employee();
	
	private static void initData() {
		testUser1.setFirstName("Adam");
		testUser1.setLastName("Arbeit");
		testUser1.setAbbreviation("testuser1");
		testUser1.setQualificationNumber(1111);
		
		testUser2.setFirstName("Bernd");
		testUser2.setLastName("Bond");
		testUser2.setAbbreviation("testuser2");
		testUser2.setQualificationNumber(2222);
		
		testUser3.setFirstName("Christina");
		testUser3.setLastName("Charles");
		testUser3.setAbbreviation("testuser3");
		testUser3.setQualificationNumber(3333);
		
		EmployeeProvider.getInstance().add(testUser1);
		EmployeeProvider.getInstance().add(testUser2);
		EmployeeProvider.getInstance().add(testUser3);
	}
	// END INIT //
	
	@Override
	protected void init(VaadinRequest request) {	
		initData();
		NavigationManager manager = new NavigationManager();
		manager.setCurrentComponent(new StartMenuView());
		setContent(manager);

		getPage().setTitle("Woundmanagement-App v0.3");
	}

	
	/**
	 * Customizes the JNDI Connection in order to connect to
	 * a database defined in the local tomcat server config
	 * without publishing the user credentials in the source code.
	 * 
	 * @author Stefan, Betz
	 */
	/*@Deprecated
	@Override
	public void customize(Session session) throws Exception {
		JNDIConnector connector = null;
	    Context context = null;
	    try {
	      context = new InitialContext();
	      if(null != context) {
	        connector = (JNDIConnector)session.getLogin().getConnector(); // possible CCE
	        // Change from COMPOSITE_NAME_LOOKUP to STRING_LOOKUP
	        // Note: if both jta and non-jta elements exist this will only change the first one - and may still result in
	        // the COMPOSITE_NAME_LOOKUP being set
	        // Make sure only jta-data-source is in persistence.xml with no non-jta-data-source property set
	        connector.setLookupType(JNDIConnector.STRING_LOOKUP);
	 
	        // Or, if you are specifying both JTA and non-JTA in your persistence.xml then set both connectors to be safe
	        JNDIConnector writeConnector = (JNDIConnector)session.getLogin().getConnector();
	        writeConnector.setLookupType(JNDIConnector.STRING_LOOKUP);
	        JNDIConnector readConnector =
	            (JNDIConnector)((DatabaseLogin)((ServerSession)session).getReadConnectionPool().getLogin()).getConnector();
	        readConnector.setLookupType(JNDIConnector.STRING_LOOKUP);
	 
	        System.out.println("_JPAEclipseLinkSessionCustomizer: configured " + connector.getName());
	      }
	    } catch(Exception e) { 
	    	e.printStackTrace();
	    }
	}*/
}

package com.fau.amos.team2.WoundManagement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.vaadin.addon.touchkit.server.TouchKitServlet;
import com.vaadin.server.ServiceException;
import com.vaadin.server.SessionInitEvent;
import com.vaadin.server.SessionInitListener;

@SuppressWarnings("serial")
@WebServlet("/*")
public class WoundManagementServlet extends TouchKitServlet {
    
    private WoundManagementUIProvider uiProvider = new WoundManagementUIProvider();
    
    @Override
    protected void servletInitialized() throws ServletException {
        super.servletInitialized();
        
        // TODO: Place a correct call to initialize the database before first UI access.
        EmployeeProvider.getInstance();
        
        getService().addSessionInitListener(new SessionInitListener() {
            @Override
            public void sessionInit(SessionInitEvent event) throws ServiceException {
                event.getSession().addUIProvider(uiProvider);
            }
        });
    }

}

package com.fau.amos.team2.WoundManagement;

import javax.servlet.ServletException;

import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.vaadin.addon.touchkit.server.TouchKitServlet;

@SuppressWarnings("serial")
public class WoundManagementServlet extends TouchKitServlet {
    
    @Override
    protected void servletInitialized() throws ServletException {
        super.servletInitialized();
        
        // TODO: Place a correct call to initialize the database before first UI access.
        EmployeeProvider.getInstance();
        
        getTouchKitSettings().getApplicationCacheSettings().setCacheManifestEnabled(true);
    }

}

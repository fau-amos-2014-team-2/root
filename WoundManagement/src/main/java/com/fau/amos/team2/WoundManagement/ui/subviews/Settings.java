package com.fau.amos.team2.WoundManagement.ui.subviews;

import com.fau.amos.team2.WoundManagement.ui.SessionedPopover;
import com.vaadin.annotations.PreserveOnRefresh;
//import com.vaadin.annotations.Theme;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;

@PreserveOnRefresh
@SuppressWarnings("serial")
public class Settings extends SessionedPopover {

	public Settings(Button changeWardButton, Button logoutButton) {
		
		setClosable(true);
		
		VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		
		layout.addComponents(changeWardButton, logoutButton);
		
		setContent(layout);
		
	}
	
}

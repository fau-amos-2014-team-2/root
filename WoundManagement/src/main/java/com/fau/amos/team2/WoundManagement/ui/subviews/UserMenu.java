package com.fau.amos.team2.WoundManagement.ui.subviews;

import com.fau.amos.team2.WoundManagement.WoundManagementUI;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.SessionedPopover;
import com.vaadin.server.Page;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class UserMenu extends SessionedPopover {
	
	private static final long serialVersionUID = -2421504489974417272L;

	public UserMenu() {
		setClosable(true);
		
		setWidth("150px");
		setHeight("150px");
		
		VerticalLayout vLayout = new VerticalLayout();
		vLayout.setSizeFull();
		vLayout.setSpacing(true);
		
		final Button changePinBtn = new Button(MessageResources.getString("changePIN"));
		changePinBtn.addStyleName("btn-default");
		changePinBtn.setWidth("100%");
		changePinBtn.addClickListener(new ClickListener() {
			
			private static final long serialVersionUID = -3536092956596410294L;

			@Override
			public void buttonClick(ClickEvent event) {
				UserPasswordView userPasswordView = new UserPasswordView();
				userPasswordView.showRelativeTo(changePinBtn);
			}
		});
		
		final Button changeLanguageBtn = new Button(MessageResources.getString("changeLang"));
		changeLanguageBtn.addStyleName("btn-default");
		changeLanguageBtn.setWidth("100%");
		changeLanguageBtn.addClickListener(new ClickListener() {
			
			private static final long serialVersionUID = 8063616332533617413L;

			@Override
			public void buttonClick(ClickEvent event) {
				LanguageView languageView = new LanguageView(UserMenu.this);
				languageView.showRelativeTo(changeLanguageBtn);
			}
		});
		
		
		Button logoutBtn = new Button(MessageResources.getString("logout"));
		logoutBtn.addStyleName("btn-danger");
		logoutBtn.setWidth("100%");
		logoutBtn.addClickListener(new ClickListener() {
			
			private static final long serialVersionUID = -5407861436538744384L;

			@Override
			public void buttonClick(ClickEvent event) {
				((WoundManagementUI)UI.getCurrent()).getEnvironment().logout();
				close();
				Page.getCurrent().setUriFragment("login");
			}
		});
		
		vLayout.addComponent(changePinBtn);
		vLayout.addComponent(changeLanguageBtn);
		vLayout.addComponent(logoutBtn);
		
		setContent(vLayout);
	}

}

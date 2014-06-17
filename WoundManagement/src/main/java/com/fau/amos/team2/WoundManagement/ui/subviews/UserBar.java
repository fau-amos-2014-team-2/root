package com.fau.amos.team2.WoundManagement.ui.subviews;

import com.fau.amos.team2.WoundManagement.WoundManagementUI;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.UserLoginView;
import com.fau.amos.team2.WoundManagement.ui.UserPasswordView;
import com.fau.amos.team2.WoundManagement.ui.UserWardView;
import com.fau.amos.team2.WoundManagement.ui.UserWardView.WardChangeEvent;
import com.fau.amos.team2.WoundManagement.ui.UserWardView.WardChangeListener;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class UserBar extends HorizontalLayout implements WardChangeListener{

	private static final long serialVersionUID = -4951908208446762117L;
	
	private Label wardLabel;

	@SuppressWarnings("serial")
	public UserBar(final NavigationView currentView) {
		Employee currentEmployee = ((WoundManagementUI)UI.getCurrent()).getEnvironment().getCurrentEmployee();

		if (currentEmployee != null) {						
			VerticalLayout userAndWardPanel = new VerticalLayout();

			Label usernameLabel = new Label(currentEmployee.getFirstName()
						+ " " + currentEmployee.getLastName());
			userAndWardPanel.addComponent(usernameLabel);
			
			wardLabel = new Label(currentEmployee.getCurrentWard().getCharacterisation());
			userAndWardPanel.addComponent(wardLabel);
			
			addComponent(userAndWardPanel);
			
			final Button changeWardButton = new Button(MessageResources.getString("changeWard"));
			changeWardButton.addClickListener(new ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					UserWardView userWardView = new UserWardView();
					userWardView.addWardChangeListener(UserBar.this);
					userWardView.addWardChangeListener((WardChangeListener) currentView);
					userWardView.showRelativeTo(changeWardButton);
				}
			});
			addComponent(changeWardButton);

			final Button changePwdButton = new Button(MessageResources.getString("changePIN"));
			changePwdButton.addClickListener(new ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					new UserPasswordView().showRelativeTo(changePwdButton);
				}
			});
			addComponent(changePwdButton);
			
			final Button logoutButton = new Button(MessageResources.getString("logout"));
			logoutButton.addClickListener(new ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					((WoundManagementUI)UI.getCurrent()).getEnvironment().logout();
					currentView.getNavigationManager().setCurrentComponent(new UserLoginView());
				}
			});
			addComponent(logoutButton);

		}
	}

	@Override
	public void wardChanged(WardChangeEvent event) {
		wardLabel.setValue(event.getWard().getCharacterisation());
	}

}

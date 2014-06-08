package com.fau.amos.team2.WoundManagement.subviews;

import com.fau.amos.team2.WoundManagement.UserLoginView;
import com.fau.amos.team2.WoundManagement.UserPasswordView;
import com.fau.amos.team2.WoundManagement.UserWardView;
import com.fau.amos.team2.WoundManagement.UserWardView.WardChangeEvent;
import com.fau.amos.team2.WoundManagement.UserWardView.WardChangeListener;
import com.fau.amos.team2.WoundManagement.provider.Environment;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class UserBar extends HorizontalLayout implements WardChangeListener{

	private static final long serialVersionUID = -4951908208446762117L;
	
	private Label wardLabel;

	@SuppressWarnings("serial")
	public UserBar(final NavigationView currentView) {

		//if (Environment.INSTANCE.getCurrentEmployee() != null) {
		if (Environment.instance.get().getCurrentEmployee() != null) {
		//if (ApplicationSettings.instance.get().getCurrentEmployee() != null) {
						
			VerticalLayout userAndWardPanel = new VerticalLayout();

			// TODO
			//Label usernameLabel = new Label(Environment.INSTANCE.getCurrentEmployee().getFirstName() + " " + Environment.INSTANCE.getCurrentEmployee().getLastName());
			Label usernameLabel = new Label(Environment.instance.get().getCurrentEmployee().getFirstName()
						+ " " + Environment.instance.get().getCurrentEmployee().getLastName());
			//Label usernameLabel = new Label(ApplicationSettings.instance.get().getCurrentEmployee().getFirstName() 
						//+ " " + ApplicationSettings.instance.get().getCurrentEmployee().getLastName());
			userAndWardPanel.addComponent(usernameLabel);
			
			// TODO
			//wardLabel = new Label(Environment.INSTANCE.getCurrentEmployee().getCurrentWard().getCharacterisation());
			wardLabel = new Label(Environment.instance.get().getCurrentEmployee().getCurrentWard().getCharacterisation());
			//wardLabel = new Label(ApplicationSettings.instance.get().getCurrentEmployee().getCurrentWard().getCharacterisation());
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
					// TODO
					//Environment.INSTANCE.logout();
					Environment.instance.get().logout();
					//ApplicationSettings.instance.get().logout();
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

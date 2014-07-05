package com.fau.amos.team2.WoundManagement.ui.subviews;

import java.util.Locale;

import com.fau.amos.team2.WoundManagement.WoundManagementUI;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.SessionedNavigationView;
import com.fau.amos.team2.WoundManagement.ui.subviews.UserWardView.WardChangeEvent;
import com.fau.amos.team2.WoundManagement.ui.subviews.UserWardView.WardChangeListener;
import com.vaadin.addon.responsive.Responsive;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.server.Page;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("wm-responsive")
@PreserveOnRefresh
public class UserBar extends HorizontalLayout implements WardChangeListener{

	private static final long serialVersionUID = -4951908208446762117L;
	
	private Label wardLabel;

	@SuppressWarnings("serial")
	public UserBar(final SessionedNavigationView currentView) {
		Employee currentEmployee = ((WoundManagementUI)UI.getCurrent()).getEnvironment().getCurrentEmployee();

		if (currentEmployee != null) {						
			VerticalLayout userAndWardPanel = new VerticalLayout();

			Label usernameLabel = new Label(currentEmployee.getFirstName()
						+ " " + currentEmployee.getLastName());
			usernameLabel.addStyleName("usernameLabel");
			userAndWardPanel.addComponent(usernameLabel);
			
			wardLabel = new Label(currentEmployee.getCurrentWard().getCharacterisation());
			wardLabel.addStyleName("wardLabel");
			userAndWardPanel.addComponent(wardLabel);
			userAndWardPanel.addStyleName("userBarUserAndWardPanel");
			new Responsive(userAndWardPanel);
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
			changeWardButton.addStyleName("userBarChangeWardButton");
			new Responsive(changeWardButton);
			addComponent(changeWardButton);

			final Button changePwdButton = new Button(MessageResources.getString("changePIN"));
			changePwdButton.addClickListener(new ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					new UserPasswordView().showRelativeTo(changePwdButton);
				}
			});
			changePwdButton.addStyleName("userBarChangePwdButton");
			new Responsive(changePwdButton);
			addComponent(changePwdButton);
			
			final Button logoutButton = new Button(MessageResources.getString("logout"));
			logoutButton.addClickListener(new ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					((WoundManagementUI)UI.getCurrent()).getEnvironment().logout();
					Page.getCurrent().setUriFragment(((WoundManagementUI)UI.getCurrent()).getEnvironment().getCurrentUriFragment());
				}
			});
			logoutButton.addStyleName("userBarLogoutButton");
			new Responsive(logoutButton);
			addComponent(logoutButton);
			
			final Button languageButton = new Button();
			languageButton.setIcon(new ThemeResource("flag_" + currentView.getEnvironment().getCurrentLocale().getLanguage() + ".png"));
			languageButton.addClickListener(new ClickListener(){
				
				@Override
				public void buttonClick(ClickEvent event) {
					new LanguageView().showRelativeTo(languageButton);
				}
				
			});
			
			addComponent(languageButton);
			
			this.setWidth("100%");;

		}
	}

	@Override
	public void wardChanged(WardChangeEvent event) {
		wardLabel.setValue(event.getWard().getCharacterisation());
	}

}

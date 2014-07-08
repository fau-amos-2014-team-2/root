package com.fau.amos.team2.WoundManagement.ui.subviews;

import com.fau.amos.team2.WoundManagement.WoundManagementUI;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.ui.subviews.UserWardView.WardChangeEvent;
import com.fau.amos.team2.WoundManagement.ui.subviews.UserWardView.WardChangeListener;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@Theme("wm-responsive")
@PreserveOnRefresh
public class UserBar extends HorizontalLayout implements WardChangeListener{

	private static final long serialVersionUID = -4951908208446762117L;
	
	private Label wardLabel;

	@SuppressWarnings("serial")
	public UserBar(final SessionedNavigationView currentView) {
		Employee currentEmployee = ((WoundManagementUI)UI.getCurrent()).getEnvironment().getCurrentEmployee();

		if (currentEmployee != null) {
			final Button btn = new Button(currentEmployee.getFirstName() + " " + currentEmployee.getLastName());
			btn.addClickListener(new ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					UserMenu userMenu = new UserMenu();
					userMenu.showRelativeTo(btn);
				}
			});
			
			addComponent(btn);
		}
	}

	@Override
	public void wardChanged(WardChangeEvent event) {
		wardLabel.setValue(event.getWard().getCharacterisation());
	}

}

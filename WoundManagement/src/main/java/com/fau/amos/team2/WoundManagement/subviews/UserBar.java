package com.fau.amos.team2.WoundManagement.subviews;

import com.fau.amos.team2.WoundManagement.UserPasswordView;
import com.fau.amos.team2.WoundManagement.provider.Environment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class UserBar extends HorizontalLayout {

	private static final long serialVersionUID = -4951908208446762117L;

	@SuppressWarnings("serial")
	public UserBar() {
		if (Environment.INSTANCE.getCurrentEmployee() != null) {
			VerticalLayout userAndWardPanel = new VerticalLayout();

			Label usernameLabel = new Label(Environment.INSTANCE.getCurrentEmployee().getFirstName() + " " + Environment.INSTANCE.getCurrentEmployee().getLastName());
			userAndWardPanel.addComponent(usernameLabel);
			
			Label wardLabel = new Label(Environment.INSTANCE.getCurrentEmployee().getCurrentWard().getCharacterisation());
			userAndWardPanel.addComponent(wardLabel);
			
			addComponent(userAndWardPanel);

			final Button changePwdButton = new Button("PIN ändern");
			changePwdButton.addClickListener(new ClickListener() {
				
				@Override
				public void buttonClick(ClickEvent event) {
					new UserPasswordView().showRelativeTo(changePwdButton);
				}
			});
			addComponent(changePwdButton);

		}
	}
	
}

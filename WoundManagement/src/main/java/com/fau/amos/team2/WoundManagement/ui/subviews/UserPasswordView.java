package com.fau.amos.team2.WoundManagement.ui.subviews;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.SessionedPopover;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;

@Theme("wm-responsive")
@PreserveOnRefresh
@SuppressWarnings("serial")
public class UserPasswordView extends SessionedPopover {

		
	public UserPasswordView() {
		setClosable(true);
		setModal(true);
		
		setWidth("450px");
		setHeight("250px");

		setCaption(MessageResources.getString("changePIN"));
		final Employee user = getEnvironment().getCurrentEmployee();

		FormLayout layout = new FormLayout();
		layout.setMargin(true);
		
		final PasswordField currentPassword = new PasswordField(MessageResources.getString("currentPIN") + ":");
		final PasswordField newPassword1 = new PasswordField(MessageResources.getString("newPIN") + ":");
		final PasswordField newPassword2 = new PasswordField(MessageResources.getString("retypeNewPIN") + ":");

		layout.addComponent(currentPassword);
		layout.addComponent(newPassword1);
		layout.addComponent(newPassword2);

		Button changePasswordButton = new Button(MessageResources.getString("changePIN"));
		changePasswordButton.addClickListener(new ClickListener(){

			@Override
			public void buttonClick(ClickEvent event) {

				boolean currentPasswordCorrect = false;

				currentPasswordCorrect = user.getPdaCode().equals(currentPassword.getValue());

				if (currentPasswordCorrect){
					String newPassword = newPassword1.getValue();
					if (newPassword!= null){
						if (newPassword.length() == 4){
							if (newPassword.equals(newPassword2.getValue())){
								//set new password
								try {
									Integer newPasswordInt = Integer.parseInt(newPassword);
									user.setPdaCode("" + newPasswordInt);
									EmployeeProvider.getInstance().update(user);
									close();
								} catch (NumberFormatException e){
									Notification.show(MessageResources.getString("newPINException"));
									newPassword1.setValue("");
									newPassword2.setValue("");
								}
							} else {
								Notification.show(MessageResources.getString("matchPINException"));
								newPassword1.setValue("");
								newPassword2.setValue("");
							}
						} else {
							Notification.show(MessageResources.getString("newPINException"));
							newPassword1.setValue("");
							newPassword2.setValue("");
						}
					} else {
						Notification.show(MessageResources.getString("noPINException"));
						newPassword2.setValue("");
					}

				} else {
					Notification.show(MessageResources.getString("currentPINException"));

					currentPassword.setValue("");
					newPassword1.setValue("");
					newPassword2.setValue("");
				}
			}

		});

		layout.addComponent(changePasswordButton);

		setContent(layout);

	}
}
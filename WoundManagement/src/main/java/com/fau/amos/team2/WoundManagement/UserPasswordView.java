package com.fau.amos.team2.WoundManagement;

import java.util.ResourceBundle;

import com.fau.amos.team2.WoundManagement.i18n.MessagesBundle;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.model.Patient;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;

@SuppressWarnings("serial")
public class UserPasswordView extends NavigationView {

	private static EmployeeProvider<Employee> employeeProvider = 
			(EmployeeProvider<Employee>) EmployeeProvider.getInstance();
	
		
	public UserPasswordView(final ResourceBundle messages, final Object id){

		setCaption(messages.getString("changePIN"));
		final Employee user = employeeProvider.getByID(id);

		FormLayout layout = new FormLayout();
		final PasswordField currentPassword = new PasswordField(messages.getString("currentPIN") + ":"); //$NON-NLS-1$
		final PasswordField newPassword1 = new PasswordField(messages.getString("newPIN") + ":"); //$NON-NLS-1$
		final PasswordField newPassword2 = new PasswordField(messages.getString("retypeNewPIN") + ":"); //$NON-NLS-1$

		layout.addComponent(currentPassword);
		layout.addComponent(newPassword1);
		layout.addComponent(newPassword2);

		Button changePasswordButton = new Button(messages.getString("changePIN")); //$NON-NLS-1$
		changePasswordButton.addClickListener(new ClickListener(){

			@Override
			public void buttonClick(ClickEvent event) {

				boolean currentPasswordCorrect = false;

				try {
					currentPasswordCorrect = user.getQualificationNumber() == Integer.parseInt(currentPassword.getValue());
				} catch (NumberFormatException e){
					Notification.show(messages.getString("currentPINException")); //$NON-NLS-1$
					currentPassword.setValue(""); //$NON-NLS-1$
					newPassword1.setValue(""); //$NON-NLS-1$
					newPassword2.setValue(""); //$NON-NLS-1$
					return;
				}

				if (currentPasswordCorrect){
					String newPassword = newPassword1.getValue();
					if (newPassword!= null){
						if (newPassword.length() == 4){
							if (newPassword.equals(newPassword2.getValue())){
								//set new password
								try {
									Integer newPasswordInt = Integer.parseInt(newPassword);
									user.setQualificationNumber(newPasswordInt);
									getNavigationManager().navigateBack();
								} catch (NumberFormatException e){
									Notification.show(messages.getString("newPINException")); //$NON-NLS-1$
									newPassword1.setValue(""); //$NON-NLS-1$
									newPassword2.setValue(""); //$NON-NLS-1$
								}
							} else {
								Notification.show(messages.getString("matchPINException")); //$NON-NLS-1$
								newPassword1.setValue(""); //$NON-NLS-1$
								newPassword2.setValue(""); //$NON-NLS-1$
							}
						} else {
							Notification.show(messages.getString("newPINException")); //$NON-NLS-1$
							newPassword1.setValue(""); //$NON-NLS-1$
							newPassword2.setValue(""); //$NON-NLS-1$
						}
					} else {
						Notification.show(messages.getString("noPINException")); //$NON-NLS-1$
						newPassword2.setValue(""); //$NON-NLS-1$
					}

				} else {
					Notification.show(messages.getString("currentPINException")); //$NON-NLS-1$

					currentPassword.setValue(""); //$NON-NLS-1$
					newPassword1.setValue(""); //$NON-NLS-1$
					newPassword2.setValue(""); //$NON-NLS-1$
				}
			}

		});

		layout.addComponent(changePasswordButton);

		setContent(layout);

	}

	private static boolean isNumeric(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) return false;
	    }
	    return true;
	}
}
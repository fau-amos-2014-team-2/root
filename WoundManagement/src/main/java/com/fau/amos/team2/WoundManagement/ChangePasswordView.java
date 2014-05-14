package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;

@SuppressWarnings("serial")
public class ChangePasswordView extends NavigationView {

	public ChangePasswordView(final Object id){
		
		final Employee user = EmployeeProvider.getInstance().getByID(id);
		
		FormLayout layout = new FormLayout();
		final PasswordField currentPassword = new PasswordField("Current PIN:");
		final PasswordField newPassword1 = new PasswordField("New PIN:");
		final PasswordField newPassword2 = new PasswordField("Retype new PIN");
		
		layout.addComponent(currentPassword);
		layout.addComponent(newPassword1);
		layout.addComponent(newPassword2);
		
		Button changePasswordButton = new Button("Change PIN");
		changePasswordButton.addClickListener(new ClickListener(){

			@Override
			public void buttonClick(ClickEvent event) {
				if (user.getQualificationNumber() == Integer.parseInt(currentPassword.getValue())){
					String newPassword = newPassword1.getValue();
					if (newPassword!= null){
						if (newPassword.length() == 4 && isNumeric(newPassword)){
							if (newPassword.equals(newPassword2.getValue())){
								//set new password
								//user.setQualificationNumber(Integer.parseInt(newPassword));
								user.setQualificationNumber(Integer.parseInt(newPassword));
								getNavigationManager().navigateBack();
							} else {
								Notification.show("The PINs you entered don't match.");
								newPassword1.setValue("");
								newPassword2.setValue("");
							}
						} else {
							Notification.show("The new PIN you entered does not have requested form. /n Use a combination of four digits only.");
							newPassword1.setValue("");
							newPassword2.setValue("");
						}
					} else {
						Notification.show("You did not enter a new PIN.");
						newPassword2.setValue("");
					}
					
				} else {
					Notification.show("The current PIN you entered is not correct.");
					
					currentPassword.setValue("");
					newPassword1.setValue("");
					newPassword2.setValue("");
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

package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;

/**
 * The View that is shown, if a user has successfully logged in
 * @author ???
 */
@SuppressWarnings("serial")
public class LoggedInView extends NavigationView {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
 * The View that is shown, if a user has successfully logged in
 * @author ???
 */
	public LoggedInView(final Object id) {
		final VerticalComponentGroup mainLayout = new VerticalComponentGroup();

		Employee user = EmployeeProvider.getInstance().getByID(id);

		Label greetingLable = new Label();
		greetingLable.setValue("Hi, "
				+ user.getFirstName() + " " + user.getLastName());
		mainLayout.addComponent(greetingLable);

		NavigationButton pictureButton = new NavigationButton("Picture View");
		pictureButton.addClickListener(new NavigationButtonClickListener() {
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				getNavigationManager().navigateTo(new PictureView());
			}
		});
		

		NavigationButton logoutButton = new NavigationButton("Logout");
		logoutButton.addClickListener(new NavigationButtonClickListener() {
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				Notification.show("Tschuess!");
				getNavigationManager().navigateTo(new LoginView());
			}
		});
		
		NavigationButton patientSelectorButton = new NavigationButton(
				"Patient Selector");
		patientSelectorButton
				.addClickListener(new NavigationButtonClickListener() {
					@Override
					public void buttonClick(NavigationButtonClickEvent event) {
						getNavigationManager().navigateTo(new PatientView());
					}
				});

			NavigationButton changePasswordButton = new NavigationButton("Change Password");
		changePasswordButton.addClickListener(new NavigationButtonClickListener() {
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				getNavigationManager().navigateTo(new ChangePasswordView(id));
			}
		});
				mainLayout.addComponent(changePasswordButton);

		

		mainLayout.addComponents(patientSelectorButton, pictureButton, logoutButton);
		
		setContent(mainLayout);
	}
}

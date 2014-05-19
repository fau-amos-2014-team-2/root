package com.fau.amos.team2.WoundManagement;

import java.util.ResourceBundle;

import com.fau.amos.team2.WoundManagement.model.BodyLocation;
import com.fau.amos.team2.WoundManagement.model.Employee;
import com.fau.amos.team2.WoundManagement.provider.EmployeeProvider;
import com.fau.amos.team2.WoundManagement.provider.PatientProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.Label;

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
	public LoggedInView(final ResourceBundle messages, final Object id) {
		final VerticalComponentGroup mainLayout = new VerticalComponentGroup();

		setCaption(messages.getString("overview")); //$NON-NLS-1$

		Employee user = EmployeeProvider.getInstance().getByID(id);

		Label greetingLable = new Label();
		greetingLable.setValue(messages.getString("hi") + ", " //$NON-NLS-1$
				+ user.getFirstName() + " " + user.getLastName()); //$NON-NLS-1$
		mainLayout.addComponent(greetingLable);

		NavigationButton changePasswordButton = new NavigationButton(messages.getString("changePIN")); //$NON-NLS-1$
		changePasswordButton.setTargetView(new UserPasswordView(messages, id));
		mainLayout.addComponent(changePasswordButton);

		NavigationButton patientSelectorButton = new NavigationButton(messages.getString("patientSelection")); //$NON-NLS-1$
		patientSelectorButton.setTargetView(new PatientSelectionView(messages));
		mainLayout.addComponent(patientSelectorButton);

		NavigationButton pictureButton = new NavigationButton(messages.getString("patientView")); //$NON-NLS-1$
		pictureButton.setTargetView(new PatientView(messages, WoundProvider.getInstance().getAll().getIdByIndex(0)));
		mainLayout.addComponent(pictureButton);

		NavigationButton addWoundDataButton = new NavigationButton(messages.getString("addNewWound")); //$NON-NLS-1$
		addWoundDataButton.setTargetView(new NewWoundView(
				messages,
				PatientProvider.getInstance().getByID(PatientProvider.getInstance().getAll().getIdByIndex(0)), 
				BodyLocation.BRUSTBEIN, 
				EmployeeProvider.getInstance().getByID(EmployeeProvider.getInstance().getAll().getIdByIndex(0))));
		mainLayout.addComponent(addWoundDataButton);

		NavigationButton logoutButton = new NavigationButton(messages.getString("logout")); //$NON-NLS-1$
		logoutButton.addClickListener(new NavigationButtonClickListener() {

			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				getNavigationManager().setCurrentComponent(new UserLoginView(messages));

			}
		});
		mainLayout.addComponent(logoutButton);
		
		// added Ward View navigation button
		NavigationButton wardButton = new NavigationButton(messages.getString("wardView")); //$NON-NLS-1$
		wardButton.setTargetView(new WardSelectionView(messages, id));
		mainLayout.addComponents(wardButton);
		
		setContent(mainLayout);

	}
}

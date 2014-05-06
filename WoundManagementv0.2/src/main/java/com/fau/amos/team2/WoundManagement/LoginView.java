package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.model.Employee;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Property;
import com.vaadin.ui.AbstractSelect.ItemCaptionMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class LoginView extends NavigationView {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private Button loginButton;
	@AutoGenerated
	private PasswordField passwordField;
	@AutoGenerated
	private TextField usernameField;

	private JPAContainer<Employee> employees;

	@SuppressWarnings("deprecation")
	public LoginView() {

		HorizontalLayout main = new HorizontalLayout();
		VerticalLayout fieldsandbutton = new VerticalLayout();

		final OptionGroup logingroup = new OptionGroup("Bitte wählen:");
		
		//das aendern der Caption aendert nicht die Item-ID der optiongroup- mode explicit
		logingroup.setItemCaptionMode(ItemCaptionMode.EXPLICIT);
		//aenderung innerhalb der logingroup werden direkt mit dem server kommuniziert 
		//keine verzoegerung bei valuechange-events
		logingroup.setImmediate(true);

		usernameField = new TextField();
		usernameField.setValue("");
		usernameField.setCaption("Benutzername:");
		
		fieldsandbutton.addComponent(usernameField);

		passwordField = new PasswordField();
		passwordField.setCaption("Passwort:");
		passwordField.setValue("");
		
		fieldsandbutton.addComponent(passwordField);

		loginButton = new Button();
		loginButton.setCaption("Login");
		loginButton.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				validateData();
			}
		});
		
		fieldsandbutton.addComponent(loginButton);

		// Die Buttons/Felder auf der linken Seite, das fieldsandbutton sind hinzugefuegt
		// jetzt fehlt noch die rechte Seite- optiongroup zum auswaehlen des
		// Nutzers
		// das eintippen der Daten im rechten Menue ist aber auch noch moeglich!

		// Datenbankabfrage, wieviele nutzer gibt es sowie referenz auf deren
		// IDs
		Object[] ids = prepare();
		int quantity = ids.length;

		// hinzufuegen der Employee items
		Employee tmp = null;
		for (int z = 0; z < quantity; z++) {

			tmp = employees.getItem(ids[z]).getEntity();

			// fuege jeden employee in die Liste ein, Item-ID = datenbank ID
			// auch das setzten der Caption ueberschreibt diese nicht!
			logingroup.addItem(ids[z]);
			logingroup.setItemCaption(ids[z], ( tmp.getLastName() + "; " + tmp.getFirstName()));
		}

		// sobald etwas selektiert wird, moechten wir das wissen! //und der setimmediate
		// deshalb valueChangelistener
		//dieser fuegt die entsprechende Abkuerzung in das usernamefield ein

		logingroup.addValueChangeListener(new Property.ValueChangeListener() {

			@Override
			public void valueChange(
					com.vaadin.data.Property.ValueChangeEvent event) {
				Object blub = logingroup.getValue();

				String selectedloginname = employees.getItem(blub).getEntity()
						.getAbbreviation();
				usernameField.setValue(selectedloginname);
				usernameField.setVisible(false);
				passwordField.focus();
			}
		});

		main.addComponent(fieldsandbutton);
		main.addComponent(logingroup);

		addComponent(main);
	}

	//Hole IDs der bekannten Nutzer (aus Datenbank)
	private Object[] prepare() {

		employees = EmployeeProvider.getInstance().getAll();

		Object[] ids = employees.getItemIds().toArray();

		return ids;

	}

	private void validateData() {
		String username = usernameField.getValue();
		String password = passwordField.getValue();
		
		boolean correctdata = false;
		
		//Exception fangen falls passwort.parsetoInt nicht moeglich:
		try {
		 correctdata = EmployeeProvider.getInstance().getLogin(username, password); }
		catch (NumberFormatException e){
			Notification.show("Das Passwort besteht nur aus Zahlen!");
			this.passwordField.setValue("");
			return;
		}
		
		//Falls korrekte daten:
		if (correctdata) {
			Notification.show("Daten korrekt!");

			Object id = EmployeeProvider.getInstance().getLoginID(username,
					password);

			NavigationView next = new LoggedInView(id);
			getNavigationManager().navigateTo(next);
		} else {
			Notification.show("Falsche Daten, bitte neu eingeben! Danke!");

			this.passwordField.setValue("");
		}
	}

}
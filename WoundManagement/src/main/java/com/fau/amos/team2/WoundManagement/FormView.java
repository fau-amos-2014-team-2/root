package com.fau.amos.team2.WoundManagement;

import java.util.List;
import java.util.Map;

import com.vaadin.addon.jpacontainer.EntityProvider;
import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;
import com.vaadin.addon.touchkit.ui.DatePicker;
import com.vaadin.addon.touchkit.ui.EmailField;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.TextField;

@SuppressWarnings("serial")
public class FormView extends NavigationView {

    public FormView() {
        setCaption("Form");
        final VerticalComponentGroup content = new VerticalComponentGroup();

        final TextField nameField = new TextField("Name");
        nameField.setInputPrompt("Enter your name...");
        content.addComponent(nameField);

        final DatePicker dateField = new DatePicker("Date of Birth");
        content.addComponent(dateField);

        final EmailField emailField = new EmailField("Email");
        emailField.setInputPrompt("Enter your email address...");
        content.addComponent(emailField);

        final Button submitButton = new Button("Submit");
        submitButton.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                	Employee e = new Employee();
                	e.setFirstName(nameField.getValue());                	
                	 
                    EmployeeProvider.getInstance().add(e);
                    
                    if(EmployeeProvider.getInstance().contains(e))
                    	Notification.show("Is drin!");
                    else 
                    	Notification.show("Ist nicht drin o.O");
                    
                    String str = "";
                    List<Employee> map = EmployeeProvider.getInstance().get();
                    for(Employee emp : map) {
                    	str += emp.getId() + " " + emp.getFirstName() + "\n";
                    }
                    
                    Notification.show(str, Type.WARNING_MESSAGE);
            }
        });

        setContent(new CssLayout(content, submitButton));
    }

}

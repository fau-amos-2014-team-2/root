package de.fau.cs.amos;


import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.annotations.Widgetset;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.UI;

/**
 * The UI's "main" class
 */
@Widgetset("de.fau.cs.amos.gwt.AppWidgetSet")
public class MyTouchKitUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
    	
    	NavigationManager manager = new NavigationManager();
    	manager.setCurrentComponent(new StartView());
        setContent(manager);
    	
    	getPage().setTitle("Table Example");
    }

}
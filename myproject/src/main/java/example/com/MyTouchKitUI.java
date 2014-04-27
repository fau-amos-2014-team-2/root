package example.com;


import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.addon.touchkit.ui.TabBarView;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * The UI's "main" class
 */
@Widgetset("example.com.gwt.AppWidgetSet")
public class MyTouchKitUI extends UI {
	private static final long serialVersionUID = -2919219443011133282L;

	@Override
    protected void init(VaadinRequest request) {
    	final NavigationManager navigationManager = new NavigationManager();
    	navigationManager.setCurrentComponent(new MyMenuView());
    	setContent(navigationManager);
    }

}
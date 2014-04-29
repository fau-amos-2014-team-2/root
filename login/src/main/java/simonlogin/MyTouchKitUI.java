package simonlogin;

import com.vaadin.addon.touchkit.extensions.TouchKitIcon;
import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.addon.touchkit.ui.TabBarView;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet.Tab;
import com.vaadin.ui.UI;

/**
 * The UI's "main" class
 */
@SuppressWarnings("serial")
@Widgetset("simonlogin.gwt.AppWidgetSet")
@Theme("touchkit")
public class MyTouchKitUI extends UI {

	@Override
	protected void init(VaadinRequest request) {

		NavigationManager manager = new NavigationManager();
		manager.setCurrentComponent(new LoginView());
		setContent(manager);

		getPage().setTitle("Login Example");
	}
}

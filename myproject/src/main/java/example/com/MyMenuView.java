package example.com;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;

public class MyMenuView extends NavigationView {
	private static final long serialVersionUID = -5310803657027928140L;

	@SuppressWarnings("serial")
	public MyMenuView() {
		setCaption("Main Menu");
		final VerticalComponentGroup content = new VerticalComponentGroup();
		NavigationButton loginScreenButton = new NavigationButton("Login/Unlock Screen");
		
		NavigationButton patientSelectorButton = new NavigationButton("Patient Selector");
		
		NavigationButton pictureButton = new NavigationButton("Picture View");
		pictureButton.addClickListener(new NavigationButtonClickListener() {
			@Override
			public void buttonClick(NavigationButtonClickEvent event) {
				getNavigationManager().navigateTo(new MyPictureView());
			}
		});
		
		content.addComponents(loginScreenButton, patientSelectorButton, pictureButton);
		
		setContent(content);
	}
}

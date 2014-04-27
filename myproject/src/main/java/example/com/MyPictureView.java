package example.com;

import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.ui.CssLayout;

public class MyPictureView extends NavigationView {
	private static final long serialVersionUID = -572027045788648039L;

	public MyPictureView() {
		setCaption("Picture View");
		
		CssLayout content = new CssLayout();
		
		setContent(content);
	}
}

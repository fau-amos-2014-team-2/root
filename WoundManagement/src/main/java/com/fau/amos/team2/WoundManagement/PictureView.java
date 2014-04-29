package com.fau.amos.team2.WoundManagement;

import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.ui.CssLayout;

public class PictureView extends NavigationView {
	private static final long serialVersionUID = -572027045788648039L;

	public PictureView() {
		setCaption("Picture View");
		
		CssLayout content = new CssLayout();
		
		setContent(content);
	}
}

package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.BodyWoundSelector.WoundManager;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.ui.CssLayout;

/**
 * View to see a picture
 * 
 * @author ???
 */
public class PictureView extends NavigationView {
	private static final long serialVersionUID = -572027045788648039L;

	/**
	 * Creates a PrictureView
	 */
	public PictureView() {
		setCaption("Picture View");
		
		CssLayout content = new CssLayout();
		
		WoundManager woundManager = new WoundManager(null);
		
		content.addComponent(woundManager.getWoundSelector());
		
		setContent(content);
	}
}

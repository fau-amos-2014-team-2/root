package com.fau.amos.team2.WoundManagement.ui.subviews;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.server.Page;

public class BackButton extends NavigationButton implements NavigationButtonClickListener {

	private static final long serialVersionUID = 449912706538723388L;
	private String targetUriFragment;
	
	public BackButton(String caption, String targetUriFragment) {
		super(caption);
		setStyleName("back");
		this.targetUriFragment = targetUriFragment;
		
		addClickListener(this);
	}

	@Override
	public void buttonClick(NavigationButtonClickEvent event) {
		Page.getCurrent().setUriFragment(targetUriFragment);
	}
	
}

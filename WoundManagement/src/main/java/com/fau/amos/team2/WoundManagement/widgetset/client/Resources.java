package com.fau.amos.team2.WoundManagement.widgetset.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.resources.client.ImageResource;

public interface Resources extends ClientBundle {
	public static final Resources INSTANCE = GWT.create(Resources.class);
	
	@Source("offline.png")
	ImageResource offline();
	
	@Source("my.css")
	@NotStrict
	public CssResource css();
	
	@Source("base.css")
	@NotStrict
	public CssResource baseCss();
	
	@Source("touchkit.css")
	@NotStrict
	public CssResource touchkitCss();
}

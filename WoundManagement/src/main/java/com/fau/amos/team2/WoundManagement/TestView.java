package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.ui.SessionedNavigationView;
import com.vaadin.server.Page;
import com.vaadin.server.Page.BrowserWindowResizeEvent;
import com.vaadin.server.Page.BrowserWindowResizeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.ResizeEvent;

public class TestView extends SessionedNavigationView {
	private static final long serialVersionUID = -5310803657027928140L;

	@SuppressWarnings("serial")
	public TestView() {
		
		Window w = new Window("Window with resize listener");
		w.setImmediate(true);
		
		w.addResizeListener(new Window.ResizeListener() {
			// Page.getCurrent().addBrowserWindowResizeListener(...)
			public void windowResized(ResizeEvent e) {
				getEnvironment().setOrientation();
			}
		});

		// Layout
		boolean hasHorizontalLayout = getEnvironment().isHorizontalLayout();
		final GridLayout grid;

		if(hasHorizontalLayout) {
			grid = new GridLayout(3, 2);
			grid.setSizeFull();
			
			grid.setColumnExpandRatio(0, 0);
			grid.setColumnExpandRatio(1, 0);
			grid.setColumnExpandRatio(2, 0);
		}else{
			grid = new GridLayout(2, 3);
			grid.setSizeFull();
			
			grid.setColumnExpandRatio(0, 0);
			grid.setColumnExpandRatio(1, 0);
		}

		Button btnOne = new Button("one");
		Button btnTwo = new Button("two");
		Button btnThree = new Button("three");
		Button btnFour = new Button("four");
		Button btnFive = new Button("five");
		Button btnSix = new Button("six");
		
		grid.addComponents(btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix);
		w.setContent(grid);

		UI.getCurrent().addWindow(w);
		


	}
}


/*

UI.getCurrent().setImmediate(true);
UI.getCurrent().setResizeLazy(true);
Page.getCurrent().addBrowserWindowResizeListener(new BrowserWindowResizeListener() {
	@Override
	public void browserWindowResized(BrowserWindowResizeEvent event) {
		getEnvironment().setOrientation();
	}
});

*/
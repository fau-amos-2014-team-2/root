package com.fau.amos.team2.WoundManagement;

import com.fau.amos.team2.WoundManagement.ui.SessionedNavigationView;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
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
		boolean hasHorizontalLayout = getEnvironment().getOrientation();
		final GridLayout grid;
		
		if(hasHorizontalLayout) {
			grid = new GridLayout(3, 2);
		}else{
			grid = new GridLayout(2, 3);
		}

		Button btnOne = new Button("one");
		Button btnTwo = new Button("two");
		Button btnThree = new Button("three");
		Button btnFour = new Button("four");
		Button btnFive = new Button("five");
		Button btnSix = new Button("six");
		
		grid.addComponents(btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix);
		w.setContent(grid);
		
		setContent(w);
		


	}
}


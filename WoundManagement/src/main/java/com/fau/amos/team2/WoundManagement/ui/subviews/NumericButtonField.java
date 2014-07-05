package com.fau.amos.team2.WoundManagement.ui.subviews;

import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.vaadin.addon.responsive.Responsive;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.ui.AbstractTextField;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Button.ClickEvent;

public class NumericButtonField extends GridLayout {

	private static final long serialVersionUID = 3620326775088580922L;

	private AbstractTextField textField;
	private Button enterButton;
	private Button.ClickListener backListener;
	
	public NumericButtonField(AbstractTextField field) {
		
		super(3, 4);
		
		setWidth("95%");
		setHeight("80%");
		
		addStyleName("nmrcField");
		
		new Responsive(this);

		this.textField = field;

		addNumericButtons();
		addClearButton();
		addEnterButton();
	}
	
	public void addEnterListener(Button.ClickListener listener) {
		enterButton.addClickListener(listener);
	}
	
	public void setBackListener(Button.ClickListener listener) {
		backListener = listener;
	}
	
	private void addNumericButtons() {
		Button zeroButton = new Button("0", this.numericButtonListener);
		zeroButton.setData(0);
		zeroButton.setWidth("95%");
		addComponent(zeroButton, 1, 3);
		setComponentAlignment(zeroButton, Alignment.MIDDLE_CENTER);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				int numericValue = 3 * i + j + 1;

				Button numericButton = new Button("" + numericValue, numericButtonListener);
				numericButton.setData(numericValue);
				numericButton.setWidth("95%");

				addComponent(numericButton, j, i);
				setComponentAlignment(numericButton, Alignment.MIDDLE_CENTER);
			}
		}
	}

	private Button.ClickListener numericButtonListener = new Button.ClickListener() {
		private static final long serialVersionUID = -8148145584125983009L;

		public void buttonClick(ClickEvent event) {
			textField.setValue(textField.getValue() + event.getButton().getData());
		}
	};

	private void addClearButton() {
		Button clearButton = new Button(MessageResources.getString("numericFieldClearBtn"), clearButtonListener);
		clearButton.setWidth("95%");
		addComponent(clearButton, 0, 3);
		setComponentAlignment(clearButton, Alignment.MIDDLE_CENTER);
	}

	private Button.ClickListener clearButtonListener = new Button.ClickListener() {
		private static final long serialVersionUID = 1841357312369783167L;

		public void buttonClick(ClickEvent event) {
			if (textField.getValue().length() > 0) {			
				textField.setValue(textField.getValue().substring(0, textField.getValue().length() - 1));
			}
			
			else if (backListener != null) {
				backListener.buttonClick(event);
			}
		}
	};

	private void addEnterButton() {
		
		enterButton = new Button(MessageResources.getString("numericFieldEnterBtn"));
		enterButton.setWidth("95%");
		enterButton.setClickShortcut(KeyCode.ENTER);
		addComponent(enterButton, 2, 3);
		setComponentAlignment(enterButton, Alignment.MIDDLE_CENTER);
	}
}

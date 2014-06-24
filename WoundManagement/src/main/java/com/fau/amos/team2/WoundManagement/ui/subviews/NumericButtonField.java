package com.fau.amos.team2.WoundManagement.ui.subviews;

import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.vaadin.addon.responsive.Responsive;
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
		/*setSpacing(true);
		setColumnExpandRatio(0, 0);
		setColumnExpandRatio(1, 0);
		setColumnExpandRatio(2, 0);*/
		setWidth("95%");
		addStyleName("grid");
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
	
	/*
	  private void addNumericButtons() {
	 
		
		VerticalLayout row0 = new VerticalLayout();
		row0.setWidth("95%");
		addComponent(row0);
		new Responsive(row0);
		
		VerticalLayout row1 = new VerticalLayout();		
		row1.setWidth("95%");
		addComponent(row1);
		new Responsive(row1);
		
		VerticalLayout row2 = new VerticalLayout();		
		row2.setWidth("95%");
		addComponent(row2);
		new Responsive(row2);
		
		VerticalLayout row3 = new VerticalLayout();		
		row3.setWidth("95%");
		addComponent(row3);
		new Responsive(row3);
		
		Button oneButton = new Button("1", this.numericButtonListener);
		oneButton.setData(1);
		oneButton.setWidth("95%");
		row0.addComponent(oneButton);
		//row0.setComponentAlignment(oneButton, Alignment.MIDDLE_LEFT);
		
		Button twoButton = new Button("2", this.numericButtonListener);
		twoButton.setData(2);
		twoButton.setWidth("95%");
		row0.addComponent(twoButton);
		//row0.setComponentAlignment(twoButton, Alignment.MIDDLE_CENTER);
		
		Button threeButton = new Button("3", this.numericButtonListener);
		threeButton.setData(3);
		threeButton.setWidth("95%");
		row0.addComponent(threeButton);
		//row0.setComponentAlignment(threeButton, Alignment.MIDDLE_RIGHT);
		
		//addComponent(row0);
		//setComponentAlignment(row0, Alignment.MIDDLE_CENTER);
		
		addComponent(row0);
		

		Button fourButton = new Button("4", numericButtonListener);
		fourButton.setData(4);
		fourButton.setWidth("95%");
		row1.addComponent(oneButton);
		//row1.setComponentAlignment(fourButton, Alignment.MIDDLE_LEFT);
		
		Button fiveButton = new Button("5", numericButtonListener);
		fiveButton.setData(5);
		fiveButton.setWidth("95%");
		row1.addComponent(fiveButton);
		//row1.setComponentAlignment(fiveButton, Alignment.MIDDLE_CENTER);
		
		Button sixButton = new Button("6", numericButtonListener);
		sixButton.setData(6);
		sixButton.setWidth("95%");
		row1.addComponent(sixButton);
		//row1.setComponentAlignment(sixButton, Alignment.MIDDLE_RIGHT);
		
		//addComponent(row1);
		//setComponentAlignment(row1, Alignment.MIDDLE_CENTER);
		
		addComponent(row1);
		
		
		Button sevenButton = new Button("7", numericButtonListener);
		sevenButton.setData(7);
		sevenButton.setWidth("95%");
		row2.addComponent(sevenButton);
			
		Button eightButton = new Button("8", numericButtonListener);
		eightButton.setData(8);
		eightButton.setWidth("95%");
		row2.addComponent(eightButton);
		
		Button nineButton = new Button("9", numericButtonListener);
		nineButton.setData(9);
		nineButton.setWidth("95%");
		row2.addComponent(nineButton);		

		addComponent(row2);

	
		Button clearButton = new Button(MessageResources.getString("numericFieldClearBtn"), clearButtonListener);
		clearButton.setWidth("95%");
		row3.addComponent(clearButton);
		
		Button zeroButton = new Button("0", numericButtonListener);
		zeroButton.setData(0);
		zeroButton.setWidth("95%");
		row3.addComponent(zeroButton);	
		
		Button enterButton = new Button(MessageResources.getString("numericFieldEnterBtn"));
		enterButton.setWidth("95%");
		row3.addComponent(enterButton);

		addComponent(row3);
	

	}	****/
	
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
		addComponent(enterButton, 2, 3);
		setComponentAlignment(enterButton, Alignment.MIDDLE_CENTER);
	}
}
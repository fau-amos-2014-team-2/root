package com.fau.amos.team2.WoundManagement.BodyWoundSelector;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;

import com.fau.amos.team2.WoundManagement.model.Sex;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Notification;

@SuppressWarnings("serial")
public class WoundSelector extends AbsoluteLayout {

	final String BODY_IMAGE = "body_neuter.png";
	final String BODY_IMAGE_MALE = "body_male.png";
	final String BODY_IMAGE_FEMALE = "body_female.png";
	final int BODY_IMAGE_WIDTH = 600;
	final int BODY_IMAGE_HEIGHT = 513;

	final String SELECTION_INDICATOR = "orb.png";
	final String WOUND_INDICATOR = "wound.png";
	final String WOUND_SELECTION_INDICATOR = "orbsel.png";
	final int INDICATOR_HEIGHT = 24;
	final int INDICATOR_WIDTH = 24;

	private Image selectionIndicator;
	private Image selectedWoundIndicator;
	private WoundManager woundManager;
	private WoundPosition selectedWoundPosition;
	private Map<WoundPosition, Image> markedWounds = new HashMap<WoundPosition, Image>();

	private Boolean existingWoundSelected = false;
	
	public WoundSelector(WoundManager woundManager, Sex sex) {
		this.woundManager = woundManager;

		Image backgroundImage;
		if (sex == Sex.FEMALE)
			backgroundImage = getImage(BODY_IMAGE_FEMALE);
		else if (sex == Sex.MALE)
			backgroundImage = getImage(BODY_IMAGE_MALE);
		else
			backgroundImage = getImage(BODY_IMAGE);

		backgroundImage.addClickListener(clickListener);

		selectionIndicator = getImage(SELECTION_INDICATOR);
		selectionIndicator.setVisible(false);

		selectedWoundIndicator = getImage(WOUND_SELECTION_INDICATOR);
		selectedWoundIndicator.setVisible(false);

		addComponents(backgroundImage, selectionIndicator, selectedWoundIndicator);

		setWidth(backgroundImage.getWidth(), Unit.PIXELS);
		setHeight(backgroundImage.getHeight(), Unit.PIXELS);
	}

	private Image getImage(String imageFilename) {
		String basePath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();
		String filePath = basePath + "/" + imageFilename;
		File imageFile = new File(filePath);
		BufferedImage bufferedImage;
		Image image = new Image(null, new FileResource(imageFile));

		if (imageFilename == BODY_IMAGE || imageFilename == BODY_IMAGE_FEMALE || imageFilename == BODY_IMAGE_MALE) {
			image.setHeight(BODY_IMAGE_HEIGHT, Unit.PIXELS);
			image.setWidth(BODY_IMAGE_WIDTH, Unit.PIXELS);
		}
		else if (imageFilename == SELECTION_INDICATOR || imageFilename == WOUND_INDICATOR || imageFilename == WOUND_SELECTION_INDICATOR) {
			image.setHeight(INDICATOR_HEIGHT, Unit.PIXELS);
			image.setWidth(INDICATOR_WIDTH, Unit.PIXELS);
		}
		else {
			// We need to load the image and get the size since Vaadin Touchkit cannot read the size itself
			try {
				bufferedImage = ImageIO.read(imageFile);
				image.setHeight(bufferedImage.getHeight(), Unit.PIXELS);
				image.setWidth(bufferedImage.getWidth(), Unit.PIXELS);
			} catch (IOException e) {
				// we fail silently and let Vaadin use autosizing
			}
		}

		return image;
	}

	private ClickListener clickListener = new ClickListener() {
		public void click(ClickEvent event) {
			int xPosition = event.getRelativeX();
			int yPosition = event.getRelativeY();

			// Uncomment the following line so show clicked position coordinates.
			// Notification.show("X " + xPosition + " Y " + yPosition);

			// Get the wound at this position
			WoundPosition woundPosition = woundManager.getWoundPositionAtCoordinates(xPosition, yPosition);

			if (woundPosition != null) {
				selectedWoundPosition = woundPosition;
				existingWoundSelected = woundManager.hasWoundAtPosition(selectedWoundPosition);

				refreshSelectedWound();
			}
		}
	};

	private void refreshSelectedWound() {
		if (selectedWoundPosition != null && existingWoundSelected) {
			Notification.show(MessageResources.getString("woundAt") + " " + selectedWoundPosition.getDescription());

			// Removing half the size of the indicator to put the click position in the middle of the indicator
			float correctedXPos = (float)selectedWoundPosition.getXPosition() - (selectedWoundIndicator.getWidth() / 2);
			float correctedYPos = (float)selectedWoundPosition.getYPosition() - (selectedWoundIndicator.getHeight() / 2);

			ComponentPosition imagePosition = new ComponentPosition();
			imagePosition.setLeft((float)correctedXPos, Unit.PIXELS);
			imagePosition.setTop((float)correctedYPos, Unit.PIXELS);

			setPosition(selectedWoundIndicator, imagePosition);

			selectedWoundIndicator.setVisible(true);
		}
		else {
			selectedWoundIndicator.setVisible(false);
		}

		refreshSelectionIndicator();
	}

	public WoundPosition getSelectedWoundPosition() {
		return selectedWoundPosition;
	}

	public void addWoundAtPosition(WoundPosition woundPosition) {
		if (!markedWounds.containsKey(woundPosition)) {
			Image image = getImage(WOUND_INDICATOR);
			image.addClickListener(woundClickListener);
			image.setDescription(woundPosition.getDescription());
			image.setAlternateText(woundPosition.getDescription());

			// Removing half the size of the indicator to put the click position in the middle of the indicator
			float correctedXPos = (float)woundPosition.getXPosition() - (image.getWidth() / 2);
			float correctedYPos = (float)woundPosition.getYPosition() - (image.getHeight() / 2);

			ComponentPosition imagePosition = new ComponentPosition();
			imagePosition.setLeft((float)correctedXPos, Unit.PIXELS);
			imagePosition.setTop((float)correctedYPos, Unit.PIXELS);
			image.setData(woundPosition);

			markedWounds.put(woundPosition, image);
			addComponent(image);
			setPosition(image, imagePosition);
		}
	}

	private ClickListener woundClickListener = new ClickListener() {

		@Override
		public void click(ClickEvent event) {
			Object sourceData = ((Image)event.getSource()).getData();
			if (sourceData != null) {
				WoundPosition woundPosition = (WoundPosition)sourceData;
				selectedWoundPosition = woundPosition;
				existingWoundSelected = true;
				refreshSelectedWound();
			}
		}
	};

	public void removeWoundAtPosition(WoundPosition woundPosition) {
		if (markedWounds.containsKey(woundPosition)) {
			Image image = markedWounds.get(woundPosition);
			markedWounds.remove(woundPosition);
			removeComponent(image);
		}
	}

	private void refreshSelectionIndicator() {
		if (existingWoundSelected) {
			selectionIndicator.setVisible(false);
			return;
		}

		Notification.show(selectedWoundPosition.getDescription());

		// Removing half the size of the indicator to put the click position in the middle of the indicator
		float correctedXPos = (float)selectedWoundPosition.getXPosition() - (selectionIndicator.getWidth() / 2);
		float correctedYPos = (float)selectedWoundPosition.getYPosition() - (selectionIndicator.getHeight() / 2);

		ComponentPosition newPosition = new ComponentPosition();
		newPosition.setLeft(correctedXPos, Unit.PIXELS);
		newPosition.setTop(correctedYPos, Unit.PIXELS);

		selectionIndicator.setVisible(true);
		setPosition(selectionIndicator, newPosition);
	}
}
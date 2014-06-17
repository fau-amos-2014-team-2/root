package com.fau.amos.team2.WoundManagement.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.provider.WoundDescriptionProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundLevelProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundTypeProvider;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.server.StreamResource;
import com.vaadin.server.StreamResource.StreamSource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.VerticalLayout;

public class ShowWoundPhotoView extends NavigationView {
	private static final long serialVersionUID = -530803657027928140L;
	private Wound wound;

	private WoundDescriptionProvider woundDescriptionProvider = WoundDescriptionProvider
			.getInstance();
	private WoundLevelProvider woundLevelProvider = WoundLevelProvider
			.getInstance();
	private WoundTypeProvider woundTypeProvider = WoundTypeProvider
			.getInstance();
	private WoundProvider woundProvider = WoundProvider.getInstance();

	private final WoundDescription woundDescription;
	private Button showImage;

	@SuppressWarnings("serial")
	public ShowWoundPhotoView(final WoundDescription woundDescription) {
		this.woundDescription = woundDescription;

		setCaption("Wound-Photo-View");

		// using stream-resource class to avoid creation/deletion of unnecessary
		// files to show the image, inspired by example of vaadin-book:
		// https://vaadin.com/book/vaadin7/-/page/application.resources.html
		final class MyImageSource implements StreamSource {
			ByteArrayInputStream imagebuffer = null;

			/*
			 * We need to implement this method that returns the resource as a
			 * stream.
			 */
			public InputStream getStream() {

				try {

					imagebuffer = new ByteArrayInputStream(
							woundDescription.getImage());

					return imagebuffer;
				} catch (Exception e) {
					Notification
							.show("Something ugly went wrong, plz tell an SD about this - Error in ShowWoundPhotoView/getStream(catced Exception");
					return null;
				}
			}
		}

		final Embedded image = new Embedded("Woundimage");
		image.setVisible(false);
		image.setMimeType("image/*");

		showImage = new Button("Bild anzeigen");

		showImage.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {

				// Fixed: by using streamresources, the image is now shown
				// without creating a file
				StreamSource imagesource = new MyImageSource();
				StreamResource resource = new StreamResource(imagesource,
						"bufferedimage.png");

				image.setSource(resource);
				image.setVisible(true);
			}
		});

		Panel panel = new Panel("Wundbild:");
		Layout panelContent = new VerticalLayout();
		panelContent.addComponent(showImage);

		panelContent.addComponents(image);
		panel.setContent(panelContent);

		setContent(panel);
	}

	public void onBecomingVisible() {

		// if there is no image yet, the button show image will be disabled (&
		// -ausgegraut-)
		// will add functionality so that the user will actually not get to this
		// view, if there is no image present in the database
		if (woundDescription.getImage() == null) {
			Notification.show("Zu dieser Beschreibung gibt es noch kein Bild!");
			showImage.setEnabled(false);
		} else {
			showImage.setEnabled(true);
			// Notification.show("es gibt ein Bild =)");
		}
	}
}

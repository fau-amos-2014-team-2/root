package com.fau.amos.team2.WoundManagement.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.server.StreamResource;
import com.vaadin.server.StreamResource.StreamSource;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.provider.WoundDescriptionProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundLevelProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundTypeProvider;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.server.StreamResource;
import com.vaadin.server.StreamResource.StreamSource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Image;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.VerticalLayout;

@Theme("wm-responsive")
@PreserveOnRefresh
public class ShowWoundPhotoView extends NavigationView {
	private static final long serialVersionUID = -530803657027928140L;

	@SuppressWarnings("serial")
	public ShowWoundPhotoView(final WoundDescription woundDescription) {
		if (woundDescription.getImage() != null) {

			DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
			setCaption(MessageResources.getString("photo") + " "
					+ dateFormat.format(woundDescription.getDate()));

			System.out.println("Photo: "
					+ woundDescription.getImage().hashCode());
			// using stream-resource class to avoid creation/deletion of
			// unnecessary
			// files to show the image, inspired by example of vaadin-book:
			// https://vaadin.com/book/vaadin7/-/page/application.resources.html
			final class MyImageSource implements StreamSource {
				ByteArrayInputStream imagebuffer = null;

				/*
				 * We need to implement this method that returns the resource as
				 * a stream.
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

			final Embedded image = new Embedded();
			image.setVisible(false);
			image.setMimeType("image/*");

			// Fixed: by using streamresources, the image is now shown
			// without creating a file
			StreamSource imagesource = new MyImageSource();
			StreamResource resource = new StreamResource(imagesource,
					"bufferedimage.png");
			
			Image myImage = new Image(null, resource);

			Panel panel = new Panel();
			Layout panelContent = new VerticalLayout();

			panelContent.addComponent(myImage);
			/*panelContent.addComponent(image);
			image.setSource(resource);
			image.setVisible(true);
			image.setSizeFull();*/
			panel.setContent(panelContent);

			setContent(panel);
		}
	}

}

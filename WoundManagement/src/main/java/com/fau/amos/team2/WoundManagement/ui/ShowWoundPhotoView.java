package com.fau.amos.team2.WoundManagement.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.subviews.BackButton;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickEvent;
import com.vaadin.addon.touchkit.ui.NavigationButton.NavigationButtonClickListener;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.server.Page;
import com.vaadin.server.StreamResource;
import com.vaadin.server.StreamResource.StreamSource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Image;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

@Theme("wm-responsive")
@PreserveOnRefresh
public class ShowWoundPhotoView extends SessionedNavigationView {
	private static final long serialVersionUID = -530803657027928140L;
	
	private WoundDescription woundDescription;

	@SuppressWarnings("serial")
	public ShowWoundPhotoView() {
		this.woundDescription = getEnvironment().getCurrentWoundDescription();
		if (woundDescription.getImage() != null) {

			DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
			setCaption(MessageResources.getString("photo") + " "
					+ dateFormat.format(woundDescription.getDate()));

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

			/* not needed anymore, using Image-myImage instead
			final Embedded image = new Embedded();
			image.setVisible(false);
			image.setMimeType("image/*");
			 */

			// Fixed: by using streamresources, the image is now shown
			// without creating a file
			StreamSource imagesource = new MyImageSource();
			StreamResource resource = new StreamResource(imagesource,
					"bufferedimage.png");
			
			Image myImage = new Image(null, resource);
			myImage.setSizeFull();

			Panel panel = new Panel();
			Layout panelContent = new VerticalLayout();

			panelContent.addComponent(myImage);
			/*panelContent.addComponent(image);
			image.setSource(resource);
			image.setVisible(true);
			image.setSizeFull();*/
			panel.setContent(panelContent);

			setContent(panel);
			
			setLeftComponent(new BackButton(MessageResources.getString("showWoundDescView"), "showWoundDescription"));
		}
	}

}

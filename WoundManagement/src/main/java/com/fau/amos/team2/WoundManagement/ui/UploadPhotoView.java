package com.fau.amos.team2.WoundManagement.ui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.provider.WoundDescriptionProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundLevelProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundTypeProvider;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.server.FileResource;
import com.vaadin.server.Page;
import com.vaadin.server.StreamResource;
import com.vaadin.server.VaadinService;
import com.vaadin.server.WebBrowser;
import com.vaadin.server.StreamResource.StreamSource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Upload.Receiver;
import com.vaadin.ui.Upload.SucceededEvent;
import com.vaadin.ui.Upload.SucceededListener;
import com.vaadin.ui.VerticalLayout;

@PreserveOnRefresh
@SuppressWarnings("unused")
public class UploadPhotoView extends NavigationView implements Upload.Receiver {
	private static final long serialVersionUID = -530803657027928140L;
	private Wound wound;

	private WoundDescriptionProvider woundDescriptionProvider = WoundDescriptionProvider
			.getInstance();
	private WoundLevelProvider woundLevelProvider = WoundLevelProvider
			.getInstance();
	private WoundTypeProvider woundTypeProvider = WoundTypeProvider
			.getInstance();
	private WoundProvider woundProvider = WoundProvider.getInstance();
	private WoundDescription wounddescription;
	private Label overwrite;
	@SuppressWarnings("serial")
	public UploadPhotoView(final WoundDescription woundDescription) {
		/*
		 * Because it was not possible to add an "gwt-imageupload" to our
		 * woundmanagment-project,which is used in the parking demo*, i started
		 * implementing the most basic approach of upload,which is inspired by
		 * the vaadin-book:
		 * https://vaadin.com/book/vaadin7/-/page/components.upload.html
		 * 
		 * (*)https://github.com/vaadin/parking-demo/blob/master/src/main/java/com
		 * /vaadin/demo/parking/widgetset/client/ticketview/PhotoLayout.javathe
		 * features of the parking demo extend those implemented here a bit.
		 * Sadly, those classesused in the parking demo [ImageUpload extends
		 * FileUploadExt implements ImageDataSource],can -in the decent state-
		 * NOT be added to our project.When this is fixed, the following upload
		 * may become deprecated & gets replaced by a superior one.
		 */
		this.wounddescription = woundDescription;
		setCaption("Upload-new-Photo-View");
		overwrite = new Label();
		overwrite.setCaption("Es liegt bereits ein Bild vor. Erneuter Upload überschreibt dieses!");
		overwrite.setVisible(false);
		
		final Embedded image = new Embedded("Uploaded Image");
		image.setVisible(false);

		// Implement both receiver that saves upload in a file and
		// listener for successful upload

		
		// like in the showwoundphotoview, we use bytearrayoutputstreams so we
		// do not have to create files
		final ByteArrayOutputStream bos = new ByteArrayOutputStream();

		class ImageUploader implements Receiver, SucceededListener {

			public OutputStream receiveUpload(String filename, String mimeType) {

				/*
				 * if the selected File is NOT an image (mimeType: image/*), do
				 * not upload.
				 */
				if (!(mimeType.startsWith("image"))) {
					Notification
							.show("Invalid file selected for Upload. Please only Upload Photos!");
					return null;
				}

				return bos;

			}

			public void uploadSucceeded(SucceededEvent event) {
				// if upload succeeded, add picture to database
				/*
				 * Show the uploaded file in the image viewer showing picture at
				 * this point is not necessary & in conflict with deleting the
				 * file after having added it to the database
				 * image.setVisible(true); image.setSource(new
				 * FileResource(file));
				 */
				byte[] bFile = bos.toByteArray();

				woundDescription.setImage(bFile);
				Notification
						.show("Bild Upload erfolgreich! :)");
				// Fixed: by using streamresources, the image is now shown
				// without creating a file
				// using stream-resource class to avoid creation/deletion of
				// unnecessary
				// files to show the image, inspired by example of vaadin-book:
				// https://vaadin.com/book/vaadin7/-/page/application.resources.html
				final class MyImageSource implements StreamSource {
					ByteArrayInputStream imagebuffer = null;

					/*
					 * We need to implement this method that returns the
					 * resource as a stream.
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

				StreamSource imagesource = new MyImageSource();
				StreamResource resource = new StreamResource(imagesource,
						"bufferedimage.png");

				image.setSource(resource);
				image.setVisible(true);

			}

		}
		;
		ImageUploader receiver = new ImageUploader();

		// Create the upload with a caption and set receiver later

		Upload upload = new Upload("Upload Image Here", receiver);
		upload.setButtonCaption("Start Upload");
		upload.addSucceededListener(receiver);

		Panel panel = new Panel("Wound-Image-Uploadstorage");
		Layout panelContent = new VerticalLayout();
		
		panelContent.addComponent(overwrite);

		final NavigationButton showrecentlyuploadedphoto = new NavigationButton(
				"Upload-Bild anzeigen");
		showrecentlyuploadedphoto.setTargetView(new ShowWoundPhotoView(
				woundDescription));
		panelContent.addComponent(showrecentlyuploadedphoto);

		panelContent.addComponents(upload, image);
		panel.setContent(panelContent);

		setContent(panel);
	}

	@Override
	public OutputStream receiveUpload(String filename, String mimeType) {
		// TODO Auto-generated method stub
		Notification
				.show("!!!!this method is never called, it's implemented in class ImageUploader!!!");
		return null;
	}
	
	public void onBecomingVisible() {
		
		//make overwrite-Warning-Label visible if there is already a picture for this description
		if (wounddescription.getImage() != null) {
			overwrite.setVisible(true);
		}
	}
}

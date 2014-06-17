package com.fau.amos.team2.WoundManagement.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.provider.WoundDescriptionProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundLevelProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundTypeProvider;
import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.server.FileResource;
import com.vaadin.server.Page;
import com.vaadin.server.WebBrowser;
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





@SuppressWarnings("unused")
public class UploadPhotoView extends NavigationView implements Upload.Receiver {
	private static final long serialVersionUID = -530803657027928140L;
	private Wound wound;
	
	
	private WoundDescriptionProvider woundDescriptionProvider =
			WoundDescriptionProvider.getInstance();
	private WoundLevelProvider woundLevelProvider =
			WoundLevelProvider.getInstance();
	private WoundTypeProvider woundTypeProvider = 
			WoundTypeProvider.getInstance();
	private WoundProvider woundProvider = 
			WoundProvider.getInstance();
	
	@SuppressWarnings("serial")
	public UploadPhotoView(final WoundDescription woundDescription) {
	/*Because it was not possible to add an "gwt-imageupload" to our woundmanagment-project, 
	 *which is used in the parking demo*, i started implementing the most basic approach of upload,
	 *which is inspired by the vaadin-book: 
	 *https://vaadin.com/book/vaadin7/-/page/components.upload.html
	 *
	 *(*)https://github.com/vaadin/parking-demo/blob/master/src/main/java/com/vaadin/demo/parking/widgetset/client/ticketview/PhotoLayout.java
	 *the features of the parking demo extend those implemented here a bit. Sadly, those classes
	 *used in the parking demo [ImageUpload extends FileUploadExt implements ImageDataSource], 
	 *can -in the decent state- NOT be added to our project.
	 *When this is fixed, the following upload may become deprecated & gets replaced by a superior one.
	 *
	 */
		
		
		
		setCaption("Upload-new-Photo-View");
		final Embedded image = new Embedded("Uploaded Image");
		image.setVisible(false);
		

		// Implement both receiver that saves upload in a file and
		// listener for successful upload
		
		if (woundDescription.getImage() != null){
			Notification.show("Es wurde bereits ein Bild hochgeladen, ein erneuter Upload überschreibt das bisherige.");
		}
		
		
		
		
		class ImageUploader implements Receiver, SucceededListener {
			public File file;

			public OutputStream receiveUpload(String filename, String mimeType) {
				
				/*
				 * if the selected File is NOT an image (mimeType: image/*), 
				 * do not upload.
				 */
				if (!(mimeType.startsWith("image"))) {
					Notification.show("Invalid file selected for Upload. Please only Upload Photos!");
					return null;
				}
				
				// Create upload stream
				FileOutputStream fos = null; // Stream to write to

				
				try {
					// Open the file for writing.
					file = new File("/tmp/uploads/" + filename);
					
					
					fos = new FileOutputStream(file);
				}

				catch (final java.io.FileNotFoundException e) {
					new Notification("Could not open file<br/>",
							e.getMessage(), Notification.Type.ERROR_MESSAGE)
							.show(Page.getCurrent());
					return null;
				}
				return fos; // Return the output stream to write to
			}

			public void uploadSucceeded(SucceededEvent event) {
				//if upload succeeded, add picture to database
				// Show the uploaded file in the image viewer
				image.setVisible(true);
				image.setSource(new FileResource(file));
				
				byte[] bFile = new byte[(int) file.length()];
					 
					        try {
					         FileInputStream fileInputStream = new FileInputStream(file);
					         fileInputStream.read(bFile);
					         fileInputStream.close();
					        } catch (Exception e) {
					        	Notification.show("shitr");
					         e.printStackTrace();
					        }
				woundDescription.setImage(bFile);
			
				/*testing/debug notifications to check image-sizes & correct upload
				Notification.show("testwunde groese get image"+ woundDescription.getImage().length);
				Notification.show("bFile groese " + bFile.length);
				Notification.show("");
				
				byte[] testinggg= woundDescription.getImage();
				boolean blub=false;
				for(int z =0; z<bFile.length; z++){
					
					blub=(testinggg[z] == bFile[z])?(true):(false);
				}
				Notification.show("true oder? + " +blub);
				 */
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
		
		final NavigationButton showrecentlyuploadedphoto = new NavigationButton("Upload-Bild anzeigen");
		showrecentlyuploadedphoto.setTargetView(new ShowWoundPhotoView(woundDescription));
		panelContent.addComponent(showrecentlyuploadedphoto);
		
	
		
		panelContent.addComponents(upload, image);
		panel.setContent(panelContent);

		setContent(panel);
	}

	@Override
	public OutputStream receiveUpload(String filename, String mimeType) {
		// TODO Auto-generated method stub
		Notification.show("!!!!this method is never called, it's implemented in class ImageUploader!!!");
		return null;
	}
}

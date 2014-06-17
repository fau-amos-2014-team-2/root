package com.fau.amos.team2.WoundManagement.ui;

import java.io.File;
import java.io.FileOutputStream;
import com.fau.amos.team2.WoundManagement.model.Wound;
import com.fau.amos.team2.WoundManagement.model.WoundDescription;
import com.fau.amos.team2.WoundManagement.provider.WoundDescriptionProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundLevelProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundProvider;
import com.fau.amos.team2.WoundManagement.provider.WoundTypeProvider;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
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
		
		final Embedded image = new Embedded("Woundimage");
		image.setVisible(false);
		image.setMimeType("image/*");

		/* just for Debug/Testing purposes, checking whether length/size of uploaded image is correct
		if (woundDescription.getImage() != null) {
			Notification.show("testwunde --:"
					+ woundDescription.getImage().length);
		} else {
			Notification.show("testwunde --: noch null");

		}
	   */

		showImage = new Button("Bild anzeigen");
		
		showImage.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				try {
					String basepath = VaadinService.getCurrent()
							.getBaseDirectory().getAbsolutePath();
					//Notification.show("verzeichnis: " + basepath);

					
					/*new testing stuff starts here
					ByteArrayOutputStream imagebuffer = new ByteArrayOutputStream();
					imagebuffer.write(woundDescription.getImage());
					StreamResource resource = new StreamResource;

					
					//until here
					*/
					FileOutputStream fos = new FileOutputStream(
							"/tmp/uploads/temp.jpg");
					fos.write(woundDescription.getImage());
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

				// FIXME: show image with database as source, not creating a
				// file.

				File fileaddr = new File("/tmp/uploads/temp.jpg");
				image.setSource(new FileResource(fileaddr));
				image.setVisible(true);
				//Notification.show("hmm jep jep hjep");
				fileaddr.deleteOnExit();

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
		//will add functionality so that the user will actually not get to this view, if there is no image present in the database
		if (woundDescription.getImage() == null) {
			Notification.show("Zu dieser Beschreibung gibt es noch kein Bild!");
			showImage.setEnabled(false);
		} else {
			showImage.setEnabled(true);
			//Notification.show("es gibt ein Bild =)");
		}
	}
}

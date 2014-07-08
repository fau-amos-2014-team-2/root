package com.fau.amos.team2.WoundManagement.ui.subviews;

import java.util.List;
import java.util.Locale;

import com.fau.amos.team2.WoundManagement.WoundManagementUI;
import com.fau.amos.team2.WoundManagement.resources.MessageResources;
import com.fau.amos.team2.WoundManagement.ui.SessionedPopover;
import com.vaadin.server.Page;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class LanguageView extends SessionedPopover {
	
	private static final long serialVersionUID = -3273159459890848409L;

	public LanguageView(final UserMenu userMenu){
		setClosable(true);
		setModal(true);
		
		VerticalLayout verticalLayout = new VerticalLayout();
		verticalLayout.setSpacing(true);
		List<Locale> allowedLocales = ((WoundManagementUI)UI.getCurrent()).getEnvironment().getAllowedLocales();
		for (final Locale locale : allowedLocales){
			Button button = new Button();
			button.setIcon(new ThemeResource("flag_" + locale.getLanguage() + ".png"));
			button.addClickListener(new ClickListener(){

				private static final long serialVersionUID = 7316827450072805483L;

				@Override
				public void buttonClick(ClickEvent event) {
					((WoundManagementUI)UI.getCurrent()).getEnvironment().setCurrentLocale(locale);
					MessageResources.setLocale(((WoundManagementUI)UI.getCurrent()).getEnvironment().getCurrentLocale());
					Page.getCurrent().setUriFragment("");
					Page.getCurrent().setUriFragment(((WoundManagementUI)UI.getCurrent()).getEnvironment().getCurrentUriFragment());
					close();
					userMenu.close();
				}
				
			});
			verticalLayout.addComponent(button);
		}
		
		setContent(verticalLayout);
	}

}

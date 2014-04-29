package simonlogin;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * This UI is served for browsers that don't support TouchKit.
 *
 */
@SuppressWarnings("serial")
public class MyFallbackUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        HorizontalLayout layout = new HorizontalLayout();
        layout.setSpacing(true);
        layout.setMargin(true);
        
        Button button = new Button("Continue anyway.", new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                getSession().setAttribute("mobile", true);
                getUI().getPage().reload();
            }
        });
        button.addStyleName("link");
        
        layout.addComponent(new Label("You seem to be using a desktop browser."));
        layout.addComponent(button);
        
        setContent(layout);
    }

}

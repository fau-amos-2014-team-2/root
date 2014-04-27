package example.com;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * This UI is served for browsers that don't support TouchKit.
 *
 */
public class MyFallbackUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label(
                "This app is only designed for mobile webkit based devices"));

    }

}

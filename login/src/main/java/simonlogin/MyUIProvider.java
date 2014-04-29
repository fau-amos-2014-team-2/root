package simonlogin;

import com.vaadin.server.UIClassSelectionEvent;
import com.vaadin.server.UIProvider;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class MyUIProvider extends UIProvider {
    
    @Override
    public Class<? extends UI> getUIClass(UIClassSelectionEvent event) {
        String userAgent = event.getRequest().getHeader("user-agent").toLowerCase();
        if (overrideMobileUA() || userAgent.contains("mobile")) {
            return MyTouchKitUI.class;
        } else {
            return MyFallbackUI.class;
        }
    }
    
    private boolean overrideMobileUA() {
        VaadinSession session = VaadinSession.getCurrent();
        return session != null && session.getAttribute("mobile") != null;
    }
}

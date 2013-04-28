package prykualiatl;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

public class PryKualiAtlApp extends SingleFrameApplication
{

    @Override protected void startup() {
        show(new JFrmMdi());
        
    }

    @Override protected void configureWindow(java.awt.Window root) {
    }

    public static PryKualiAtlApp getApplication() {
        return Application.getInstance(PryKualiAtlApp.class);
    }

    public static void main(String[] args) {
        launch(PryKualiAtlApp.class, args);
    }
}

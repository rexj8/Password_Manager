import java.awt.*;
import java.net.URI;

public class OpenURL {

    public static void showList() {

    }

    public static void getLink(String url) {
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI(url);
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

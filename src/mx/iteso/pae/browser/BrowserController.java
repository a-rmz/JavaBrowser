package mx.iteso.pae.browser;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;

public class BrowserController {
    MenuButton menuButtonClose;

    @FXML
    protected void close() {
        Platform.exit();
    }
}

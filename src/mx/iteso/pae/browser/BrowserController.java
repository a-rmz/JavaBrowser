package mx.iteso.pae.browser;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.concurrent.Worker.State;
import javafx.event.ActionEvent;

public class BrowserController implements Initializable{
    MenuButton menuButtonClose;
    @FXML 
    Button btnPrevious;
    @FXML
    Button btnNext;
    @FXML
    Button btnSearch;
    @FXML
    ChoiceBox<String> cbHistorial;
    @FXML
    TextField tfDirecciones;
    @FXML
    private WebView wbWebView;
    
    WebEngine engine;
    @FXML
    protected void close() {
        Platform.exit();
    }
    
    public void previous() {
    	
    }
    
    public void next() {
    	
    }
    
    public void search(ActionEvent event) {
    	String direccion = tfDirecciones.getText();
    	if(tfDirecciones.getText() != "") {
    		engine.load("http://" + direccion);
    	}    	
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		engine = wbWebView.getEngine();		
	}
}

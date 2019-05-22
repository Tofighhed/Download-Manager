package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;

public class SecondpageController implements Initializable {
    @FXML
    private Button ok_second;
    @FXML
    private AnchorPane anchorMain;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void goback(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Firstpage.fxml"));
        anchorMain.getScene().setRoot(root);
    }
}


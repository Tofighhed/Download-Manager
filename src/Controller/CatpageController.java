package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
public class CatpageController implements Initializable {
    @FXML
    private AnchorPane catPage;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goback_catpage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Firstpage.fxml"));
        catPage.getScene().setRoot(root);
    }

    @FXML
    private void Video_list(ActionEvent event) {
        
    }

    @FXML
    private void Pic_list(ActionEvent event) {
    }

    @FXML
    private void Music_list(ActionEvent event) {
    }

    @FXML
    private void Prgrm_list(ActionEvent event) {
    }

    @FXML
    private void Docu_list(ActionEvent event) {
    }
    
}

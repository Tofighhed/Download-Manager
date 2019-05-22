package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;
public class FirstpageController implements Initializable {
    @FXML
    private SplitPane splitPaneMain;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CatOnAct(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Catpage.fxml"));
        splitPaneMain.getScene().setRoot(root);
    }

    @FXML
    private void ExitMain(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void GoTo_nextPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Secondpage.fxml"));
        splitPaneMain.getScene().setRoot(root);
    }

    @FXML
    private void Downloading_list(ActionEvent event) {
    }

    @FXML
    private void Downloaded_list(ActionEvent event) {
    }

    @FXML
    private void Stopped_list(ActionEvent event) {
    }

    @FXML
    private void Losed_list(ActionEvent event) {
    }
}

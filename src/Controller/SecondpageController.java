package Controller;

import model.DownloadManager;
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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SecondpageController implements Initializable {
    @FXML
    private AnchorPane anchorMain;
    @FXML
    private TextField Url_field;
    @FXML
    private AnchorPane download_page;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    private void goback(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Firstpage.fxml"));
        anchorMain.getScene().setRoot(root);
    }

    @FXML
    private void ok_second(ActionEvent event) throws IOException {
        String url1 = Url_field.getText().toString();
        DownloadManager.start_download(url1);
        Parent root = FXMLLoader.load(getClass().getResource("/View/Downloadingpg.fxml"));
        download_page.getScene().setRoot(root);

    }

}




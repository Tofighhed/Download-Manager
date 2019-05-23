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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SecondpageController implements Initializable {

    private Stage primaryStage;
    private FXMLLoader loader;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void setLoader(FXMLLoader loader) {
        this.loader = loader;
    }

    @FXML
    private Button ok_second;
    @FXML
    private AnchorPane anchorMain;

    @FXML
    private TextField str_url;
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
    public void add_url(javafx.event.ActionEvent event)throws IOException{

    String url1 = str_url.getText();


    }
}


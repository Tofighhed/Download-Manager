package Controller;
import model.Data;
import model.DownlaodFile;
import model.DownloadManager;
import  model.Pause;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;
public class DownloadingpgController implements Initializable {
    
    private DownlaodFile dlFile;
    
    @FXML
    private AnchorPane download_page;
    @FXML
    private Button cancel_download;
    @FXML
    private ProgressIndicator prgress_download;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    public void UrlReceiver(DownlaodFile dlFile)
    {
        this.dlFile = dlFile;
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                while(dlFile.getStatus_int() != 0 ) //Madami Ke Status File Dar Hale Download Ast
                {
                    prgress_download.setProgress(dlFile.getLast_downloaded_byte() / dlFile.getFile_size());
                }
            }
        });
    }
    @FXML
    private void cancel_download(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Firstpage.fxml"));
        download_page.getScene().setRoot(root);
    }

    @FXML
    private void pause_download(ActionEvent event) {
        DownloadManager.pause_download(dlFile.getUrl());
    }
    @FXML
    private void resume_download(ActionEvent event) {
        DownloadManager.resume_download(dlFile.getUrl());
    }
}
package Controller;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.net.URL;
import java.sql.Time;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import com.sun.xml.internal.bind.v2.runtime.property.PropertyFactory;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import model.Data;
import model.DownlaodFile;
import model.DownloadManager;

public class FirstpageController implements Initializable {

//    int sort_mod = 0; // 0 = all
//    Timer timer = new Timer();
//    TimerTask timerTask = new TimerTask() {
//        @Override
//        public void run() {
//            set_table_data(sort_mod);
//        }
//    };

    @FXML
    private SplitPane splitPaneMain;
    @FXML
    private TableView tableView;

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
    private void START (ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("/View/Catpage.fxml"));
//        splitPaneMain.getScene().setRoot(root);

//        downloadManager.setUrl("http://dl.faazmusic.com/server/1398/2%20ordibehesht/30/Mostafa%20Yeganeh%20-%20Che%20Konam%20Ba%20To%20(128).mp3");
//        downloadManager1.setUrl("https://as11.cdn.asset.aparat.com/aparat-video/9434fd236c6814080323682d04da4b1915028371-480p__35163.mp4");
//        DownloadManager.start_download("http://dl.faazmusic.com/server/1398/2%20ordibehesht/30/Mostafa%20Yeganeh%20-%20Che%20Konam%20Ba%20To%20(128).mp3");
//        tableView.refresh();
        DownloadManager.start_download("http://dl.faazmusic.com/server/1398/2%20ordibehesht/30/Mostafa%20Yeganeh%20-%20Che%20Konam%20Ba%20To%20(128).mp3");
        Downloading_list(event);
//        tableView.refresh();

//        timer.scheduleAtFixedRate(timerTask , 1000 , 2000 );
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
private TableColumn tableColumnname=new TableColumn();
    @FXML
private TableColumn tableColumnsize=new TableColumn();
@FXML
private TableColumn tableColumntype= new TableColumn();
@FXML
private TableColumn tableColumnpersent=new TableColumn();

@FXML
private TableView tab=new TableView();

public void setdatein_all(){

    tableColumnname.setCellValueFactory(new PropertyValueFactory<>("name"));
    tableColumnsize.setCellValueFactory(new PropertyValueFactory<>("file_size"));
    tableColumntype.setCellValueFactory(new PropertyValueFactory<>("file_type"));
    tableColumnpersent.setCellValueFactory(new PropertyValueFactory<>("persent"));

    ObservableList ob=Data.list_all();
    tab.setItems(ob);
    tableView.refresh();
}

    @FXML
    private void Downloading_list(ActionEvent event) {
        setdatein_all();
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


//    public void set_table_data (int mod){
//        ArrayList<DownlaodFile> list = Data.getFiles();
//        ArrayList<DownlaodFile> using_list = new ArrayList<>();
//
//        switch (mod){
//            case 0:
//                // all OK
//                using_list = list;
//                break;
//        }
//
//        TableView tableView = new TableView();
//
//        tableView.getItems().clear();
//        for (DownlaodFile df:using_list) {
//            tableView.getItems().add(df);
//        }
//
//        tableView.refresh();
////
//        VBox vbox = new VBox(tableView);
////
//        Scene scene = new Scene(vbox);
////
//        this.splitPaneMain.getItems().get(1).getAccessibleHelp();
//        this.setScene(scene);
//
//        primaryStage.show();
//
//        tableView.getItems().add(new Person("Jane", "Deer"));





    }


//}

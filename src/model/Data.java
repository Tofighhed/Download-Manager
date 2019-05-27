package model;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sun.print.DialogOwner;

import java.util.ArrayList;
import java.util.Observable;
import java.util.zip.DeflaterOutputStream;

public class Data {

    private static ArrayList<DownlaodFile> data_files_all = new ArrayList<>();

    public static ArrayList<DownlaodFile> getFiles() {
        return data_files_all;
    }

    public static void setFiles(DownlaodFile file) {
        data_files_all.add(file);
    }


    public static ArrayList<DownlaodFile> finished_files() {
        ArrayList<DownlaodFile> finishe_files = new ArrayList<>();
        for (DownlaodFile file : getFiles()) {
            if (file.getStatus_int() == 2) {
                finishe_files.add(file);
            }
        }
        return finishe_files;
    }


    public static ArrayList<DownlaodFile> failed_files() {
        ArrayList<DownlaodFile> faile_files = new ArrayList<>();
        for (DownlaodFile file : getFiles()) {
            if (file.getStatus_int() == 3) {
                faile_files.add(file);
            }
        }
        return faile_files;
    }


    public static ObservableList list_all (){

      ObservableList<DownlaodFile>  filess = FXCollections.observableArrayList(getFiles());
        filess.removeAll(FXCollections.observableArrayList(getFiles()));
        filess.addAll(FXCollections.observableArrayList(getFiles()));
        return filess;
    }


    public static ArrayList<DownlaodFile> paused_files() {
        ArrayList<DownlaodFile> pause_files = new ArrayList<>();
        for (DownlaodFile file : getFiles()) {
            if (file.getStatus_int() == 3) {
                pause_files.add(file);
            }
        }
        return pause_files;
    }

    public static ArrayList<DownlaodFile> downloading_files() {
        ArrayList<DownlaodFile> downloadin_files = new ArrayList<DownlaodFile>();
        for (DownlaodFile file : getFiles()) {
            if (file.getStatus_int() == 3) {
                downloadin_files.add(file);
            }
        }
        return downloadin_files;
    }


    public static ArrayList<DownlaodFile> mp3_files() {
        ArrayList<DownlaodFile> song_files = new ArrayList<>();
        for (DownlaodFile file : Data.getFiles()) {
            if (file.getFile_type().equalsIgnoreCase("mp3")) {
                song_files.add(file);
            }

        }
        return song_files;
    }


    public static ArrayList<DownlaodFile> video_files() {
        ArrayList<DownlaodFile> movie_files = new ArrayList<>();
        for (DownlaodFile file : Data.getFiles()) {
            if (file.getFile_type().equalsIgnoreCase("mp4") || file.getFile_type().equalsIgnoreCase("mkv")) {
                movie_files.add(file);
            }

        }
        return movie_files;
    }


    public static ArrayList<DownlaodFile> rar_files() {
        ArrayList<DownlaodFile> zip_files = new ArrayList<>();
        for (DownlaodFile file : Data.getFiles()) {
            if (file.getFile_type().equalsIgnoreCase("rar") || file.getFile_type().equalsIgnoreCase("zip")) {
                zip_files.add(file);
            }

        }
        return zip_files;
    }


    public static ArrayList<DownlaodFile> document_files() {
        ArrayList<DownlaodFile> doc_files = new ArrayList<>();
        for (DownlaodFile file : Data.getFiles()) {
            if (file.getFile_type().equalsIgnoreCase("pdf") || file.getFile_type().equalsIgnoreCase("doc") || file.getFile_type().equalsIgnoreCase("docx")) {
                doc_files.add(file);
            }

        }
        return doc_files;
    }


    public static ArrayList<DownlaodFile> program_files() {
        ArrayList<DownlaodFile> prog_files = new ArrayList<>();
        for (DownlaodFile file : Data.getFiles()) {
            if (file.getFile_type().equalsIgnoreCase("exe") || file.getFile_type().equalsIgnoreCase("msi")) {
                prog_files.add(file);
            }

        }
        return prog_files;
    }

    public static double get_persent_search_by_url(String url) {

        for (DownlaodFile df : getFiles()) {
            if (df.getUrl().equalsIgnoreCase(url)) {
                return df.get_download_persent();
            }

        }
        return -1;

    }
}























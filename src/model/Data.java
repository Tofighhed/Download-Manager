package model;
import java.util.ArrayList;

public class Data {

    private static ArrayList<DownlaodFile> data_files = new ArrayList<>();

    public static ArrayList<DownlaodFile> getFiles() {
        return data_files;
    }

    public static void setFiles(DownlaodFile file) {
         data_files.add(file);
    }
}

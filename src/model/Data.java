package Model;
import java.util.ArrayList;

public class Data {

    private static ArrayList<DownlaodFile> data_files_all = new ArrayList<>();

    private static ArrayList<DownlaodFile> data_files_finished = new ArrayList<>();

    private static ArrayList<DownlaodFile> data_files_paused = new ArrayList<>();

    private static ArrayList<DownlaodFile> data_files_downloding = new ArrayList<>();

    private static ArrayList<DownlaodFile> getData_files_in_queue = new ArrayList<>();

    public static ArrayList<DownlaodFile> getData_files_finished() {
        return data_files_finished;
    }

    public static void setData_files_finished(DownlaodFile data_file_finished) {
        data_files_finished.add(data_file_finished);
    }

    public static ArrayList<DownlaodFile> getData_files_paused() {
        return data_files_paused;
    }

    public static void setData_files_paused(DownlaodFile data_file_paused) {
        data_files_paused.add(data_file_paused);
    }

    public static ArrayList<DownlaodFile> getData_files_downloding() {
        return data_files_downloding;
    }

    public static void setData_files_downloding(DownlaodFile data_file_downloding) {
        data_files_downloding.add(data_file_downloding);
    }

    public static ArrayList<DownlaodFile> getGetData_files_in_queue() {
        return getData_files_in_queue;
    }

    public static void setGetData_files_in_queue(DownlaodFile data_file_in_queue) {
        getGetData_files_in_queue().add(data_file_in_queue);
    }

    public static ArrayList<DownlaodFile> getFiles() {
        return data_files_all;
    }

    public static void setFiles(DownlaodFile file) {
        data_files_all.add(file);
    }

    /**
     * serach by name in all files*/
    public static DownlaodFile search_name_in_all(String name_of_file) {


        for (DownlaodFile df : data_files_all) {
            if (df.getName().equalsIgnoreCase(name_of_file)) {
                return df;
            }
        }
        DownlaodFile d = new DownlaodFile();
        return d;
    }
}

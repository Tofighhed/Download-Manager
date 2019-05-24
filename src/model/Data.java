package model;
import java.util.ArrayList;

public class Data {

    private static ArrayList<DownlaodFile> data_files_all = new ArrayList<>();

    public static ArrayList<DownlaodFile> getFiles() {
        return data_files_all;
    }

    public static void setFiles(DownlaodFile file) {
        data_files_all.add(file);
    }



    public static ArrayList finished_files(){
        ArrayList<DownlaodFile> finishe_files=new ArrayList<>();
        for (DownlaodFile file:getFiles()){
            if (file.getStatus_int()==2){
                finishe_files.add(file);
            }
        }
        return finishe_files;
    }




 public static ArrayList failed_files(){
        ArrayList<DownlaodFile> faile_files=new ArrayList<>();
        for (DownlaodFile file:getFiles()){
            if (file.getStatus_int()==3){
                faile_files.add(file);
            }
        }
        return faile_files;
    }






    public static ArrayList paused_files(){
        ArrayList<DownlaodFile> pause_files=new ArrayList<>();
        for (DownlaodFile file:getFiles()){
            if (file.getStatus_int()==3){
                pause_files.add(file);
            }
        }
        return pause_files;
    }
    public static ArrayList downloading_files(){
        ArrayList<DownlaodFile> downloadin_files=new ArrayList<>();
        for (DownlaodFile file:getFiles()){
            if (file.getStatus_int()==3){
                downloadin_files.add(file);
            }
        }
        return downloadin_files;
    }


public static ArrayList mp3_files(){
        ArrayList<DownlaodFile> song_files=new ArrayList<>();
        for (DownlaodFile file:Data.getFiles()){
            if (file.getFile_type().equalsIgnoreCase("mp3")){
                song_files.add(file);
            }

        }
        return song_files;
}


    public static ArrayList video_files(){
        ArrayList<DownlaodFile> movie_files=new ArrayList<>();
        for (DownlaodFile file:Data.getFiles()){
            if (file.getFile_type().equalsIgnoreCase("mp4") || file.getFile_type().equalsIgnoreCase("mkv")){
                movie_files.add(file);
            }

        }
        return movie_files;
    }



    public static ArrayList rar_files(){
        ArrayList<DownlaodFile> zip_files=new ArrayList<>();
        for (DownlaodFile file:Data.getFiles()){
            if (file.getFile_type().equalsIgnoreCase("rar") || file.getFile_type().equalsIgnoreCase("zip")){
                zip_files.add(file);
            }

        }
        return zip_files;
    }


    public static ArrayList document_files(){
        ArrayList<DownlaodFile> doc_files=new ArrayList<>();
        for (DownlaodFile file:Data.getFiles()){
            if (file.getFile_type().equalsIgnoreCase("pdf")){
                doc_files.add(file);
            }

        }
        return doc_files;
    }





    public static ArrayList program_files(){
        ArrayList<DownlaodFile> prog_files=new ArrayList<>();
        for (DownlaodFile file:Data.getFiles()){
            if (file.getFile_type().equalsIgnoreCase("mp3")){
                prog_files.add(file);
            }

        }
        return prog_files;
    }



}


























package model;

import java.io.File;

public class DownlaodFile {
    private int status;
    private String name;
    private String file_type;
    private String file_path;
    private long file_size = Long.MAX_VALUE ;
    private long last_downloaded_byte = 0;
    private File file;

    /**
     * get file of download
     * */
    public File getFile() {
        return file;
    }


    /**
     * Set file to save downloading to it !
     * */
    public void setFile(File file) {
        this.file = file;
    }

    /**How much of file has downloaded till now ..
     * */
    public double get_download_persent (long downloaded,long size){
        return (double) (downloaded / (double) (size));
    }

    public String getName() {
        return name;
    }

    public String getFile_type() {
        return file_type;
    }

    public String getFile_path() {
        return file_path;
    }

    public long getFile_size() {
        return file_size;
    }

/* statuss download_ST = statuss.downloadin;

    enum  statuss   {downloadin , finished}*/

    static final String[] stat = {"sd" , "dsad" , "asda" , "dasa"};

    /**0. unknown
     * 1. downloading
     * 2. pause
     * 3. finished
     * */
    public int getStatus_int() {
        return status;
    }

    public String getStatus_str (){
        return stat[getStatus_int() % 4];
    }


    /**
    * File has downloaded Dont try ...
    * */
    public boolean is_finished(){
        return getLast_downloaded_byte() == getFile_size();
    }

    /**
     * Will try To Download this Shit ...
     * */
    public boolean start_download (){
        return DownloadManager.download_Dfile(this);
    }

    public long getLast_downloaded_byte() {
        return last_downloaded_byte;
    }

    public void setLast_downloaded_byte(long last_downloaded_byte) {
        this.last_downloaded_byte = last_downloaded_byte;
    }

    public void setFile_size(long file_size) {
        this.file_size = file_size;
    }
}

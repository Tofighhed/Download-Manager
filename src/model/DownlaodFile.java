package model;

import java.io.File;

public class DownlaodFile {

    private int status;
    private String statuss=getStatus_str();

    public int getStatus() {
        return status;
    }

    public String getStatuss() {
        return statuss;
    }

    public void setStatuss(String statuss) {
        this.statuss = statuss;
    }

    private String name;
    private String file_type;
    private String file_path;
    private long file_size = Long.MAX_VALUE ;
    private long last_downloaded_byte = 0;
    private File file;
    private String url;
    private double persent;

    public double getPersent() {
        return persent;
    }

    public void setPersent(double persent) {
        this.persent = persent;
    }

    private DownloadManager dm;

    public DownloadManager getDm() {
        return dm;
    }

    public void setDm(DownloadManager dm) {
        this.dm = dm;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

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
    public double get_download_persent (){
        return (double) (last_downloaded_byte/ (double) (file_size));
    }

    public String getName() {
        return name;
    }

    public void setFile_type(String file_type) {
        this.file_type = file_type;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String getFile_type() {
        return file_type;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getFile_size() {
        return file_size;
    }

/* statuss download_ST = statuss.downloadin;

    enum  statuss   {downloadin , finished}*/
    /**
     * set status of file*/
//should add switch case for adding in Arraylist
    public void setStatus(int status) {
        this.status = status;
        switch (status){
            case 0:this.statuss="downloading";
            break;
            case 1:this.statuss="pause";
            break;
            case 2:this.statuss="finished";
            break;
            case 3:this.statuss="failed";
            break;
        }
    }

    /**
     * status of file*/
    static final String[] stat = {"downloading" , "pause" , "finished" ,"failed"};
    /** 0. downloading
     *  1. pause
     *  2. finished
     *  3.failed
     * */
    public int getStatus_int() {
        return status;
    }
    public String getStatus_str (){
        return stat[getStatus_int() % 4];
    }

    /**
     * to get last byte downloaded*/
    public long getLast_downloaded_byte() {
        return last_downloaded_byte;
    }
    /**
     * to set last byte downloaded*/
    public void setLast_downloaded_byte(long last_downloaded_byte) {
        this.last_downloaded_byte = last_downloaded_byte;
    }
    /**
     * to set size of file*/
    public void setFile_size(long file_size) {
        this.file_size = file_size;
    }

//    public String[] to_item() {
//        return new String[] {name , file_size + "" , getStatus_str() , get_download_persent(last_downloaded_byte , file_size) + ""};
//    }
}



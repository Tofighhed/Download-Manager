package model;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public  class DownloadManager extends Thread {
    private static DownloadManager downloadManager = null;
    private static final  int MAX_THREADS = 4;
    private static int currentThreads = 0;

    /** add new url to download
     * */
    public static boolean add_download (String url){
        return false;
    }

    /** add already exit DFile to download ...
     * */
    public static boolean download_Dfile (DownlaodFile downlaodFile){
        /* if file is download rt false
            if  no thread to donload false
            else start downloadig [Or ERROR -> False]
        * */
        return false;
    }



/*downloading the file from url
 * */
public static void download(String url){

    DownlaodFile downlaodFile=new DownlaodFile();
    Data.setFiles(downlaodFile);
    long reads=0;
    try {
        long size_of_file=getFileSize(new URL(url));
        downlaodFile.setFile_size(size_of_file);
    }
    catch (Exception e){
        e.printStackTrace();
    }

    try {
//        InputStream is = new FileInputStream("/res/example.xls");
        BufferedInputStream in=new BufferedInputStream(new URL(url).openStream());
        FileOutputStream fileOutputStream=new FileOutputStream(specify_name_of_file(url)+"."+specify_type_of_file(url));

        byte dataBuffer[]=new byte[1024];
        int bytesread;
        while ((bytesread=in.read(dataBuffer,0,1024))!=-1){
            reads=(long) bytesread+reads;
            downlaodFile.setLast_downloaded_byte(reads);
//            System.out.println(round(downlaodFile.get_download_persent(downlaodFile.getLast_downloaded_byte(),downlaodFile.getFile_size()),2));
            fileOutputStream.write(dataBuffer,0,bytesread);
        }
    }
    catch (Exception e){
        e.getCause();
    }
}




/*
* round the double for sending
* persent of downloaded in program*/
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }




/*
* return the size of file
* gonna be download*/
    public static int getFileSize(URL url) {

        URLConnection conn = null;
        try {
            conn = url.openConnection();
            if(conn instanceof HttpURLConnection) {
                ((HttpURLConnection)conn).setRequestMethod("HEAD");
            }
            conn.getInputStream();
            return conn.getContentLength();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(conn instanceof HttpURLConnection) {
                ((HttpURLConnection)conn).disconnect();
            }
        }
    }



    /*
    * specify type of file*/
    public static String specify_type_of_file(String url){
        int dot_number=url.lastIndexOf(".");
        String type=url.substring(dot_number+1,url.length());

        return type;
    }


    /*
    * specify name of file*/
    public static String specify_name_of_file(String url){
        int dot_number=url.lastIndexOf(".");
        int slash=url.lastIndexOf("/");
        String name=url.substring(slash+1,dot_number);
        return name;
    }


}

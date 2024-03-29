package model;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Paths;




public class DownloadManager extends Thread {
    private String url;

    private static final int MAX_THREADS = 4;

    public static int getMaxThreads() {
        return MAX_THREADS;
    }

    public static void setCurrentThreads(int currentThreads) {
        DownloadManager.currentThreads = currentThreads;
    }

    private static int currentThreads = 0;

    public static int getCurrentThreads() {
        return currentThreads;
    }

    /**
     * add already exit DFile to download ...
     */
    public static boolean download_Dfile(DownlaodFile downlaodFile) {
        /** if file is download rt false
         if  no thread to donload false
         else start downloadig [Or ERROR -> False]
         * */
        return false;
    }

    /**
     * download Thread
     */

    @Override
    public void run() {

        DownlaodFile downlaodFile = new DownlaodFile();
        downlaodFile.setDm(this);
        Data.setFiles(downlaodFile);
        downlaodFile.setUrl(url);
        downlaodFile.setFile_type(specify_type_of_file(url));
        long reads = 0;
        try {
            long size_of_file = getFileSize(new URL(url));
            downlaodFile.setFile_size(size_of_file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(currentThreads);
        currentThreads++;
        if (currentThreads==MAX_THREADS){
            downlaodFile.setStatus(1);
            return;
        }
        try {
            downlaodFile.setName(Paths.get(new URI(url).getPath()).getFileName().toString());
            BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
            FileOutputStream fileOutputStream = new FileOutputStream(downlaodFile.getName(),true);
            if (downlaodFile.getLast_downloaded_byte()==0){
                try {
                    in.skip(downlaodFile.getLast_downloaded_byte());
                }
                catch (Exception e){
                    e.printStackTrace();}
            }

            byte dataBuffer[] = new byte[1024];
            int bytesread;
            while ((bytesread = in.read(dataBuffer, 0, 1024)) != -1) {
                reads = (long) bytesread + reads;
                downlaodFile.setLast_downloaded_byte(reads);
                downlaodFile.setPersent(100*round(downlaodFile.get_download_persent(),2));
                System.out.println(round(downlaodFile.get_download_persent(),2));
                System.out.println(downlaodFile.getStatus_int());
                fileOutputStream.write(dataBuffer, 0, bytesread);
                if (downlaodFile.getStatus_int()==1){
                    currentThreads--;
                    break;
                }
            }
            if (bytesread==-1){downlaodFile.setStatus(2);
                currentThreads--;
                System.out.println(downlaodFile.getStatus_str());
            }


        } catch (Exception e) {
            e.getCause();
            downlaodFile.setStatus(3);
        }
    }


    /**
     * download file from url
     */






    public String getUrl() {
        return url;
    }






    public void setUrl(String url) {
        this.url = url;
    }







    /**
     * round the double for sending
     * persent of downloaded in program
     */
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }








    /**
     * return the size of file
     * gonna be download
     */
    public static int getFileSize(URL url) {

        URLConnection conn = null;
        try {
            conn = url.openConnection();
            if (conn instanceof HttpURLConnection) {
                ((HttpURLConnection) conn).setRequestMethod("HEAD");
            }
            conn.getInputStream();
            return conn.getContentLength();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (conn instanceof HttpURLConnection) {
                ((HttpURLConnection) conn).disconnect();
            }
        }
    }








    /**
     * specify type of file*/
    public static String specify_type_of_file(String url) {
        int dot_number = url.lastIndexOf(".");
        String type = url.substring(dot_number + 1, url.length());

        return type;
    }








    /**
     * specify name of file
     */
    public static String specify_name_of_file(String url) {
        int dot_number = url.lastIndexOf(".");
        int slash = url.lastIndexOf("/");
        String name = url.substring(slash + 1, dot_number);
        return name;
    }



public static void pause_download(String url){
        Pause pause=new Pause(url);
    System.out.println("ppppp");
        pause.start();

}

public static void resume_download(String url){
        Resume resume=new Resume(url);
    System.out.println("rrrrr");
        resume.start();

}







    public static void start_download(String urll){

        DownloadManager dm=new DownloadManager();
        dm.setUrl(urll);
        System.out.println("ssssss");
        dm.start();

    }

    public static void delete_downloadfile(String urll){

        Delete delete=new Delete(urll);
        Pause pause=new Pause(urll);
        pause.start();
        delete.start();


    }




}

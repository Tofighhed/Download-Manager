package model;

public  class DownloadManager {
    private static DownloadManager downloadManager = null;

    private static final  int MAX_THREADS = 4;
    private static int currentThreads = 0;

    /*public static DownloadManager getInstance(){
        if (downloadManager == null){
            return new DownloadManager();
        }else {
            return downloadManager;
        }
    }*/



    /** add new url to download
     * */
    public static boolean add_download (String url){
        return false;
    }

    /** add alredy exit DFile to download ...
     * */
    public static boolean download_Dfile (DownlaodFile downlaodFile){
        /* if file is download rt false
            if  no thread to donload false
            else start downloadig [Or ERROR -> False]
        * */
        return false;
    }




}

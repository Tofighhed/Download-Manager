package model;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Paths;

public class Resume extends Thread {

    String url;
    public Resume(){}
    public Resume(String urll){
        url=urll;
    }

    @Override
    public void run() {
        try {
            for (DownlaodFile file:Data.getFiles()){
                if (file.getUrl().equalsIgnoreCase(url)){
                    if (DownloadManager.getCurrentThreads()!=4){
                        if (file.getStatus_int()==1 || file.getStatus_int()==3) {
                            file.setStatus(0);




//                            DownlaodFile downlaodFile = new DownlaodFile();
//                            downlaodFile.setDm(this);
//                            Data.setFiles(downlaodFile);
//                            downlaodFile.setUrl(url);
//                            downlaodFile.setFile_type(specify_type_of_file(url));
                            long reads = 0;

                            if (DownloadManager.getCurrentThreads()==DownloadManager.getCurrentThreads()){
                                file.setStatus(1);
                                return;
                            }
                            try {
                                BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
                                FileOutputStream fileOutputStream = new FileOutputStream(file.getName(),true);
                                if (file.getLast_downloaded_byte()==0){
                                    try {
                                        in.skip(file.getLast_downloaded_byte());
                                    }
                                    catch (Exception e){
                                        e.printStackTrace();}
                                }

                                byte dataBuffer[] = new byte[1024];
                                int bytesread;
                                while ((bytesread = in.read(dataBuffer, 0, 1024)) != -1) {
                                    reads = (long) bytesread + reads;
                                    file.setLast_downloaded_byte(file.getLast_downloaded_byte()+reads);
                                    System.out.println(DownloadManager.round(file.get_download_persent(),2));
                                    fileOutputStream.write(dataBuffer, 0, bytesread);
                                    if (file.getStatus_int()==1){
                                        int c= DownloadManager.getCurrentThreads();
                                        c--;
                                        DownloadManager.setCurrentThreads(c);
                                        break;
                                    }
                                }
                                if (bytesread==-1){
                                    int c= DownloadManager.getCurrentThreads();
                                    c--;
                                    DownloadManager.setCurrentThreads(c);

                                    file.setStatus(2);
                                    break;

                                }

                            } catch (Exception e) {
                                e.getCause();
                                file.setStatus(4);
                            }


















                        }

                    }
                }
            }
        }
        catch (Exception e){e.printStackTrace();}
    }
}

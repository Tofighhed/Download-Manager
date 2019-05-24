package model;

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
                            System.out.println("asdnasnajndjasbfjabfjabfasasffa");

                        }

                    }
                }
            }
        }
        catch (Exception e){e.printStackTrace();}
    }
}

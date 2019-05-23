import Model.DownloadManager;

public class Main {


    public static void main(String[] args) {
        DownloadManager downloadManager= new DownloadManager();
        DownloadManager downloadManager1=new DownloadManager();
        downloadManager.setUrl("http://dl.faazmusic.com/server/1398/2%20ordibehesht/30/Mostafa%20Yeganeh%20-%20Che%20Konam%20Ba%20To%20(128).mp3");
        downloadManager1.setUrl("https://as11.cdn.asset.aparat.com/aparat-video/9434fd236c6814080323682d04da4b1915028371-480p__35163.mp4");
        downloadManager.start();
        downloadManager1.start();


    }
}

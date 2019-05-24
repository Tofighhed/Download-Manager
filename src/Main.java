import model.DownloadManager;
import model.Pause;

public class Main {


    public static void main(String[] args) {
DownloadManager.start_download("http://dl.faazmusic.com/server/1398/2%20ordibehesht/30/Mostafa%20Yeganeh%20-%20Che%20Konam%20Ba%20To%20(128).mp3");
//DownloadManager.start_download("https://as11.cdn.asset.aparat.com/aparat-video/9434fd236c6814080323682d04da4b1915028371-480p__35163.mp4");
//DownloadManager.start_download("http://dl.mymanotomusic.com/1395/12esfand/10238/Ho3ein%20-%20Khafan.mp3");
//DownloadManager.start_download("http://dl.ponel.ir/music/foreign/single/Pascal%20Letoublon%20-%20Friendships%20(Original%20Mix)%20320.mp3");
//DownloadManager.pause_download("http://dl.ponel.ir/music/foreign/single/Pascal%20Letoublon%20-%20Friendships%20(Original%20Mix)%20320.mp3");
DownloadManager.pause_download("http://dl.faazmusic.com/server/1398/2%20ordibehesht/30/Mostafa%20Yeganeh%20-%20Che%20Konam%20Ba%20To%20(128).mp3");

DownloadManager.resume_download("http://dl.faazmusic.com/server/1398/2%20ordibehesht/30/Mostafa%20Yeganeh%20-%20Che%20Konam%20Ba%20To%20(128).mp3");
//DownloadManager.start_download("http://dl.ponel.ir/music/foreign/car/Alan%20Walker%20-%20Fade.mp3");
    }
}

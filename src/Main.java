//import java.io.*;
import model.DownlaodFile;
import model.DownloadManager;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
public class Main {
    public static void main(String[] args){

       DownloadManager.download("http://www.pdf995.com/samples/pdf.pdf");




















//        String fromFile = "www.africau.edu/images/default/sample.pdf";
//        char dat=fromFile.charAt(fromFile.length()-4);
//        int last_slash=fromFile.lastIndexOf("/");
//        int last_dat=fromFile.lastIndexOf(".");
//        String dom=fromFile.substring(fromFile.lastIndexOf(".")+1,fromFile.length());
//        String nameof=fromFile.substring(last_slash+1,last_dat);
//        System.out.println(nameof);
//        System.out.println(dom);
//
//    NIOLibrary(dom,nameof);



/////////////////////////////////



//     try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
//  FileOutputStream fileOutputStream new FileOutputStream(FILE_NAME)) {
//    byte dataBuffer[] = new byte[1024];
//    int bytesRead;
//    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
//        fileOutputStream.write(dataBuffer, 0, bytesRead);
//    }
//} catch (IOException e) {
//    // handle exception
//}

//        System.out.println(bytesread);
//        downlaodFile.setLast_downloaded_byte(bytesread);

//        System.out.println(bytesread);
//        System.out.println((double)bytesread/(double)downlaodFile.getFile_size());


///////////////////////////////////

//try {
//    URL url = new URL("http://dl.worldsubtitle.us/Tpack/4/The.Blacklist.S01.WWW.WORLDSUBTITLE.IN.rar ");
//
//    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//
//    conn.setRequestMethod("GET");
//    conn.setAllowUserInteraction(false);
//    conn.setDoInput(true);
//    conn.setDoOutput(true);
//    conn.connect();
//    String raw = conn.getHeaderField("Content-Disposition");
//    System.out.println(raw);//Always getting raw value as NULL**
//
//    if (raw != null && raw.indexOf("=") != -1) {
//        String[] fileName = raw.split("=");
//        for (int g = 0; g <= fileName.length; g++) {
//            System.out.println(fileName[g]);
//        }
//    } else {
//
//    }
//}
//catch (Exception e){
//    e.getCause();
//}

        }

    public static void NIOLibrary(String first,String nameof) {
        String fromFile = "www.africau.edu/images/default/sample.pdf";
        String toFile = "asd+"+"."+"asd";

        try {

            URL website = new URL(fromFile);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(toFile);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            fos.close();
            rbc.close();

        } catch (IOException e) {
            e.getMessage();
        }
    }
}

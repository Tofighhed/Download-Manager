package model;

public class Pause extends Thread {
    String urll;
public Pause(String ur){urll=ur;}
public Pause(){}
    @Override
    public void run() {


            for (DownlaodFile file:Data.getFiles()){
                if (file.getUrl().equalsIgnoreCase(urll)){
                    file.setStatus(1);
                }
            }

        }
    }




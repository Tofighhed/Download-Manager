package model;

public class Delete extends Thread{
    String url;
    public Delete(String urll){url=urll;}
    public Delete(){}

    @Override
    public void run() {
        try {


            for (DownlaodFile df : Data.getFiles()) {
                if (df.getUrl().equalsIgnoreCase(url)) {
                    Data.getFiles().remove(df);
                    break;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

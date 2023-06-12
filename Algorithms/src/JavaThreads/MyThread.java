package JavaThreads;

public class MyThread extends Thread{
    String text;


    public MyThread(String text) {
        this.text = text;
    }

    public void run() {
        System.out.println (this.text);
    }
}

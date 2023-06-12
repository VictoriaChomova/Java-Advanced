package JavaThreadsTimer;

import JavaThreads.MyThread;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        TimerTask task1 = new TimerTask () {
            @Override
            public void run() {
                System.out.println ("Thread1: Hello!");
            }
        };

        TimerTask task2 = new TimerTask () {
            @Override
            public void run() {
                System.out.println ("Thread2: Hello!");
            }
        };

        TimerTask task3 = new TimerTask () {
            @Override
            public void run() {
                System.out.println ("Thread3: Hello!");
            }
        };

        // create two timers
        Timer timer1 = new Timer ();
        Timer timer2 = new Timer ();
        Timer timer3 = new Timer ();

        // schedule the timer tasks to run every 2 seconds
        timer1.schedule (task1, 0, 2000);
        timer2.schedule (task2, 0, 2000);
        timer3.schedule (task3, 0, 2000);


    }
}

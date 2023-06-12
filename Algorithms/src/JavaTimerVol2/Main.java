package JavaTimerVol2;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {


        DeadLockSample ds = new DeadLockSample ();
        ds.T1.start ();
        ds.T2.start ();
    }
}


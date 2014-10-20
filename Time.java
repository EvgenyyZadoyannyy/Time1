package Module2.Thread.Time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time extends Thread implements Runnable {
    private long ctm;

    public void run() {
        while (!isInterrupted()) {
            ctm = System.currentTimeMillis();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            Date dt = new Date(ctm);
            try {
                System.out.println(sdf.format(dt));
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
                return;
            }
        }
    }
}

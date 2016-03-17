package veladii.beep;

import java.awt.*;

/**
 * Created by veladii on 3/16/16.
 */
public class Beeper extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("beep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

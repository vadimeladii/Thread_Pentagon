package veladii;

import java.awt.*;

/**
 * Created by veladii on 3/16/16.
 */
public class Beeper extends Thread{

    @Override
    public void run() {
        while (true) {
           // Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(2000);
                System.out.println("beep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

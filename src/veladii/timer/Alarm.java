package veladii.timer;

import java.util.TimerTask;

/**
 * Created by veladii on 3/17/16.
 */
public class Alarm extends TimerTask{

    private String action;

    public Alarm(String action){
        this.action=action;
    }

    @Override
    public void run() {
        System.out.println("action");
    }
}

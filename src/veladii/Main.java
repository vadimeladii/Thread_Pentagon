package veladii;

import org.omg.CORBA.TIMEOUT;
import veladii.beep.Beeper;
import veladii.ex_synchronized.Buffer;
import veladii.ex_synchronized.Consumer;
import veladii.ex_synchronized.Producer;
import veladii.timer.Alarm;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;

/**
 * Created by veladii on 3/16/16.
 */
public class Main {
    public static void main(String[] args) {
        executBeeper();
    }

    public static void executBeeper(){
        Beeper beeper=new Beeper();
        ThreadGroup threadGroup = beeper.getThreadGroup();
        String name = threadGroup.getName();
        beeper.setDaemon(true);
        beeper.start();

        System.out.println("....");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void executBuffer(){
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();
    }

    public static void executTimer(){
        Timer timer=new Timer();
        timer.scheduleAtFixedRate(new Alarm("vadim"),0,1*1000);


        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.HOUR,5);
        calendar.set(Calendar.MINUTE,47);
        calendar.set(Calendar.SECOND,0);
        Date date=calendar.getTime();
        System.out.println(date);



        Timer time=new Timer();
        time.schedule(new Alarm("CULCAREA"),date);
    }
}

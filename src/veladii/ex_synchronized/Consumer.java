package veladii.ex_synchronized;

/**
 * Created by veladii on 3/16/16.
 */
public class Consumer extends Thread {

    private Buffer buffer;

    public Consumer(Buffer buffer){
        this.buffer=buffer;
    }

    @Override
    public void run() {

    }
}

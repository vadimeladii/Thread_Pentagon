package veladii.ex_synchronized;

/**
 * Created by veladii on 3/16/16.
 */
public class Producer extends Thread {

    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {

    }
}

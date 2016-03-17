package veladii.ex_synchronized;

/**
 * Created by veladii on 3/16/16.
 */
public class Consumer extends Thread {

    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int bufferNumber = buffer.get();
            System.out.println("Consumator a primit : " + bufferNumber);
        }
    }
}

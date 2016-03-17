package veladii.sort;

import java.util.Comparator;
import java.util.List;

/**
 * Created by veladii on 3/16/16.
 */
public class Sort implements Runnable {

    List<Integer> integerList = null;

    public Sort(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executSort();
        try {
            Thread.sleep(2000);
            showList();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void executSort() {
        integerList.sort(Integer::compareTo);
    }

    public void showList() {
        integerList.forEach(System.out::println);
    }
}

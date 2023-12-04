package sensor;

import extra.Logger.Logger;

import java.util.List;

/**
 * The simple thread class that reads the contents of the Data structure.
 */
public class SimpleThread extends Thread {
    /**
     * Main run implementation that reads the contents of the data structure.
     */
    @Override
    public void run() {
        Logger.request("Starting thread");
        while(true) {
            try {
                List<Double> list = DataStructure.getInstance().getAll();
                System.out.println(list.size());
                for (Double aDouble : list) {
                    System.out.println(aDouble);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

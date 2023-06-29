package sensor;

import extra.Logger.Logger;

import java.util.List;

public class SimpleThread extends Thread {
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

package sensor;

import java.util.ArrayList;
import java.util.List;

public class DataStructure {
    private List<Double> buffer;
    private static DataStructure instance;

    public synchronized static DataStructure getInstance() {
        System.out.println("Prima dell'if");
        if(instance == null) {
            System.out.println("Dentro l'if");
            instance = new DataStructure();
        }
        System.out.println("Dopo l'if");
        return instance;
    }

    private DataStructure() {
        buffer = new ArrayList<>();
    }

    public synchronized void addAll(List<Double> temperatures) throws InterruptedException {
        System.out.println("Adding stuff");
        if(buffer.size() + 5 >= 10){
            System.out.println("full buffer");
            notifyAll();
            wait();
        }
        buffer.addAll(temperatures);
    }

    public synchronized void add(Double temperature) throws InterruptedException {
        buffer.add(temperature);
        System.out.println(buffer.size());
        if(buffer.size() == 5) {
            System.out.println("full buffer");
            notifyAll();
            wait();
        }
        return;
    }

    public synchronized List<Double> getAll() throws InterruptedException {
        System.out.println("Remove stuff");
        if(buffer.isEmpty()) {
            wait();
        }
        System.out.println("Enough waiting");
        System.out.println(buffer.size());
        List<Double> tmp = new ArrayList<>(buffer);
        buffer.clear();
        notifyAll();
        return tmp;
    }
}

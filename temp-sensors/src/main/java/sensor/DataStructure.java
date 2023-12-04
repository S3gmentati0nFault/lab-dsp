package sensor;

import java.util.ArrayList;
import java.util.List;

/**
 * Data structure class for the Sensor array.
 */
public class DataStructure {
    private List<Double> buffer;
    private static DataStructure instance;

    /**
     * Implementation of the singleton. It's synchronized because the implementation is multi-thread.
     * 
     * @return The singleton instance.
     */
    public synchronized static DataStructure getInstance() {
        System.out.println("Prima dell'if");
        if(instance == null) {
            System.out.println("Dentro l'if");
            instance = new DataStructure();
        }
        System.out.println("Dopo l'if");
        return instance;
    }

    /**
     * Constructor for the class, it just instanciates a new ArrayList.
     */
    private DataStructure() {
        buffer = new ArrayList<>();
    }

    /**
     * Method that adds a list of recorded temperatures to the data structure, it was deemed a good idea to implement a read/write cycle.
     * 
     * @param temperatures The list of measurements.
     * @throws InterruptedException The exception that is thrown by the wait method.
     */
    public synchronized void addAll(List<Double> temperatures) throws InterruptedException {    
        System.out.println("Adding stuff");
        if(buffer.size() + 5 >= 10){
            System.out.println("full buffer");
            notifyAll();
            wait();
        }
        buffer.addAll(temperatures);
    }

    /**
     * A Method that adds just one temperature recording to the structure.
     * 
     * @param temperature The measurement.
     * @throws InterruptedException Unhandled exception thrown by the wait-notify mechanism.
     */
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

    /**
     * A getter for the List of measurements.
     * 
     * @return Returns the list of measurements write-safely.
     * @throws InterruptedException Unhandled exception thrown by the wait-notify mechanism.
     */
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

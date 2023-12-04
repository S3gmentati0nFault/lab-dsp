/**
 * Person class that actually implements the thread logic.
 */
public class Person extends Thread{
    private int identifier;
    private int visitDuration;
    Queue queue;

    /**
     * Constructor for the Person class
     * 
     * @param identifier Identifier for the thread
     * @param visitDuration Lifespan of the tread.
     * @param queue A pointer to the implementation of the "supermarket".
     * 
     * @see Main
     */
    public Person(int identifier, int visitDuration, Queue queue){
        this.identifier = identifier;
        this.visitDuration = visitDuration;
        this.queue = queue;
    }

    /**
     * Main run implementation for the thread.
     */
    @Override
    public void run() {
        try {
            queue.startShopping(identifier, visitDuration);
        } catch (InterruptedException e) {
            throw
                    new RuntimeException(e);
        }
    }
}

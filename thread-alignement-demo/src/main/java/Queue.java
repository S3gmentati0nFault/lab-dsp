/**
 * The Queue class should actually represent a supermarket.
 */
public class Queue {
    private int numberOfPlaces;

    /**
     * Constructor for the Queue class.
     * 
     * @param numberOfPlaces The total number of places available in the supermarket.
     */
    public Queue(int numberOfPlaces){
        this.numberOfPlaces = numberOfPlaces;
    }

    /**
     * A synchronized visit method that allows access to one thread at a time and sequentially waits for the end of the visit for all of the people.
     * 
     * @param identifier Thread identifier.
     * @param duration Expected duration of the visit.
     * @throws InterruptedException Unhandled exception for the wait-notify mechanism
     */
    synchronized public void startShopping(int identifier, int duration)
            throws InterruptedException {
        if(numberOfPlaces > 0) {
            System.out.println(ANSI_GREEN
                    + "Il thread: "
                    + identifier
                    + " ha cominciato la sua visita"
                    + ANSI_RESET);
            numberOfPlaces--;
            wait(duration);
            System.out.println(ANSI_PURPLE
                    + "Il thread: "
                    + identifier
                    + " ha terminato la sua visita"
                    + ANSI_RESET);
            numberOfPlaces++;
            notifyAll();
        }
        else{
            System.out.println(ANSI_RED
                + "Non c'é spazio, il thread: "
                + identifier
                + " é in attesa"
                + ANSI_RESET);
            wait();
            startShopping(identifier, duration);
        }
    }

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
}
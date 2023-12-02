package Data;

/**
 *  A simple Tickets class that describes the structure of the ticketing system.
 */
public class Tickets {
    private int numberOfTickets;

    /**
     *  Constructor for the tickets class, it initializes the counter associated with it.
     */
    public Tickets(){
        numberOfTickets = 0;
    }

    /**
     *  Getter for the counter associated with the class, the method is declared synchronized to
     *  make it thread-safe.
     */
    synchronized public int getNumberOfTickets(){
        return numberOfTickets;
    }

    /**
     *  Method that decreases the counter associated with the class, it is declared synchronized to
     *  make it thread-safe.
     */
    synchronized public void purchaseTickets(){
        numberOfTickets--;
    }
}

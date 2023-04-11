package Data;

public class Tickets {
    private int numberOfTickets;

    public Tickets(){
        numberOfTickets = 0;
    }

    synchronized public int getNumberOfTickets(){
        return numberOfTickets;
    }

    synchronized public void purchaseTickets(){
        numberOfTickets--;
    }
}

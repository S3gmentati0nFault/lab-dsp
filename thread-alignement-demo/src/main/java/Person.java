public class Person extends Thread{
    private int identifier;
    private int visitDuration;
    Queue queue;

    public Person(int identifier, int visitDuration, Queue queue){
        this.identifier = identifier;
        this.visitDuration = visitDuration;
        this.queue = queue;
    }

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

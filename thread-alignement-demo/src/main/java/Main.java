import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Main test class.
 */
public class Main {
    /**
     * Main method for the test class. It generates a set of people that are actually threads waiting for a random time and then tries to synchronize all of them with the join method.
     * 
     * @throws InterruptedException Unhandled exception coming from the join method.
     */
    public static void main(String[] args)
            throws InterruptedException {
        ArrayList<Thread> people =
                new ArrayList<Thread>();
        Random r =
                new Random();
        IntStream stream =
                r.ints(5, 500, 10000);
        int[] durationArray = stream.toArray();
        Queue queue = new Queue(2);

        for(int i = 0; i < 5; ++i){
            people.add(
                    new Person(i, durationArray[i], queue));
        }

        for(Thread person : people){
            person.start();
        }

        for(Thread person : people){
            person.join();
        }
    }
}

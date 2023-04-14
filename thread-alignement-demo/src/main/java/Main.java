import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
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

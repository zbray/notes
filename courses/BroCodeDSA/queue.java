import java.util.Queue;
import java.util.LinkedList;

public class queue {
    
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }
}
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(5);
        q.offer(2);
        q.offer(3);
        q.offer(7);
        q.poll();
        q.offer(5);
        q.offer(5);
        q.poll();

        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}

package lecture.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/11/26
 */
public class 응급실 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), count = 0;
        Queue<Person> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(new Person(i, sc.nextInt()));
        }
        while (!q.isEmpty()) {
            Person poll = q.poll();
            for (Person p : q) {
                if (p.getRisk() > poll.getRisk()) {
                    q.add(poll);
                    poll = null;
                    break;
                }
            }
            if (poll != null) {
                count++;
                if (poll.getId() == m) {
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}

class Person {
    @Override
    public String toString() {
        return "Person{" +
               "id=" + id +
               ", risk=" + risk +
               '}';
    }

    private Integer id;
    private Integer risk;

    public Integer getId() {
        return id;
    }

    public Integer getRisk() {
        return risk;
    }

    public Person(Integer id, Integer risk) {
        this.id = id;
        this.risk = risk;
    }
}

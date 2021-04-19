import java.util.*;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-19
 */
public class _3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            int remainder = num % 42;
            set.add(remainder);
        }
        System.out.println(set.size());
    }
}

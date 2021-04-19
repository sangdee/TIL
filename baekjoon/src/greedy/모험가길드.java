package greedy;

import java.util.*;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-19
 */
public class 모험가길드 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        list.sort(Comparator.naturalOrder());

        for (int i : list){
            count ++;
            if (count >= i){
                result++;
                count = 0;
            }
        }
        System.out.println(result);
    }
}

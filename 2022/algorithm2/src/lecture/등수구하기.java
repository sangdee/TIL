package lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/08/07
 */
public class 등수구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}

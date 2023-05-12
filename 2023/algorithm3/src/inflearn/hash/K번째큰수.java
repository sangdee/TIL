package inflearn.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/12
 */
public class K번째큰수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = initializedList(sc, n);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(list.get(i) + list.get(j) + list.get(l));
                }
            }
        }

        Integer integer = set.stream()
                             .skip(k - 1)
                             .findFirst()
                             .orElse(-1);
        System.out.println(integer);
    }

    private static List<Integer> initializedList(Scanner sc, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        return list;
    }
}

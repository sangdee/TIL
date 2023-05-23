package inflearn.sort;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/23
 */
public class 중복확인 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        System.out.println(set.size() != n ? "D" : "U");
    }
}

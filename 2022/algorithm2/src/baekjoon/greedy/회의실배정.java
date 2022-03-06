package baekjoon.greedy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/04
 */
public class 회의실배정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            list.get(i).add(sc.nextInt());
            list.get(i).add(sc.nextInt());
        }
        list.sort((o1, o2) -> {
            if (o1.get(1).equals(o2.get(1))) {
                return o1.get(0) - o2.get(0);
            }
            return o1.get(1) - o2.get(1);
        });
        int count = 0;
        int finish = 0;
        for (int i = 0; i < n; i++) {
            if (finish <= list.get(i).get(0)){
                finish = list.get(i).get(1);
                count++;
            }
        }
        System.out.println(count);
    }
}

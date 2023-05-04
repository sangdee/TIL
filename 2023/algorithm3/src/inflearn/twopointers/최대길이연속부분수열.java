package inflearn.twopointers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/04
 */
public class 최대길이연속부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0, count = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 1) {
                count++;
            }else {
                if (q.size() == k) {
                    Integer poll = q.poll();
                    q.add(rt);
                    count = rt - poll;
                }else {
                    q.add(rt);
                    count++;
                }
            }
            if (max < count) {
                max = count;
            }
        }
        System.out.println(max);
    }
}

package lecture.sort;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/11/30
 */
public class LRU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), n = sc.nextInt();
        int[] cache = new int[s];
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = sc.nextInt();
        }
        for (int x : temp) {
            int position = -1;
            for (int i = 0; i < s; i++) {
                if (x == cache[i]) {
                    position = i;
                }
            }
            if (position == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            } else {
                for (int i = position; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }
        for (int x : cache) {
            System.out.print(x + " ");
        }
    }
}

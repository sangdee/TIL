package temp;

import java.util.Scanner;

public class LRU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        solution(s, n, arr);
    }

    private static void solution(int s, int n, int[] arr) {
        int[] cache = new int[s];

        for (int i = 0; i < n; i++) {
            int step = arr[i];
            boolean hit = false;
            for (int j = 0; j < s; j++) {
                if (step == cache[j]) {
                    for (int k = j; k > 0; k--) {
                        cache[k] = cache[k - 1];
                    }
                    cache[0] = step;
                    hit = true;
                    break;
                }
            }
            if (!hit) {
                for (int k = s - 1; k > 0; k--) {
                    cache[k] = cache[k - 1];
                }
                cache[0] = step;
            }
        }

        for (int i = 0; i < s; i++) {
            System.out.print(cache[i] + " ");
        }
    }
}

package inflearn.sort;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/22
 */
public class LeastRecentlyUsed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] cache = new int[s];
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            int checkCache = checkCache(cache, data);
            if (checkCache != 0) {
                cacheHit(cache, checkCache, data);
            } else {
                cacheMiss(cache, data);
            }
        }

        for (int i : cache) {
            System.out.print(i + " ");
        }
    }

    public static int checkCache(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return 0;
    }

    public static void cacheMiss(int[] arr, int data) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = data;
    }

    public static void cacheHit(int[] arr, int index, int data) {
        for (int i = index; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = data;
    }
}

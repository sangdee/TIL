package inflearn;

import java.util.Scanner;

public class ArrayUtils {
    public static void initIntArray(Scanner sc, int length, int[] arr) {
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}

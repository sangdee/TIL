import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-03 오후 7:04
 */
public class _2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];

        int min, index = 0, temp;

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < length; i++) {
            min = Integer.MAX_VALUE;
            for (int j = i; j < length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        for (int x : arr) {
            System.out.println(x);
        }
    }
}

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-02-19
 */
public class Test {

    static int[] leftRotatebyOne(int arr[], int n) {
        int temp = arr[0], i;
        for (i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
        System.out.println(Arrays.toString(leftRotatebyOne(arr, n)));

    }
}

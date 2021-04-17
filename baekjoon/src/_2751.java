import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-03 오후 7:47
 */
public class _2751 {
    static int[] sorted;

    static void merge(int[] a, int m, int middle, int n) {

        int i = m;
        int j = middle + 1;
        int k = m;
        while (i <= middle && j <= n) {
            if (a[i] <= a[j]) {
                sorted[k] = a[i];
                i++;
            } else {
                sorted[k] = a[j];
                j++;
            }
            k++;
        }
        if (i > middle) {
            for (int l = j; l <= n; l++) {
                sorted[k] = a[l];
                k++;
            }
        } else {
            for (int l = i; l <= middle; l++) {
                sorted[k] = a[l];
                k++;
            }
        }
        for (int l = m; l <= n; l++) {
            a[l] = sorted[l];
        }
    }

    static void mergeSort(int[] a, int m, int n) {
        if (m < n) {
            int middle = (m + n) / 2;
            mergeSort(a, m, middle);
            mergeSort(a, middle + 1, n);
            merge(a, m, middle, n);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine().trim());
        sorted = new int[number];
        int[] a = new int[number];
        for (int i = 0; i < number; i++) {
            a[i] = Integer.parseInt(bufferedReader.readLine().trim());
        }
        mergeSort(a, 0, number - 1);
        for (int x : a) {
            System.out.println(x);
        }
    }
}

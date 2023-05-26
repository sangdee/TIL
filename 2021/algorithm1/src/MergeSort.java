/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-05 오전 11:56
 */
public class MergeSort {
    //최악의 경우도 O(N*logN) 보장, 일단 반으로 쪼개고 나중에 합침
    //너비 N 높이 logN
    int number = 8;
    static int[] sorted = new int[8];

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


    public static void main(String[] args) {
        int[] arr = {4, 6, 5, 2, 1, 8, 6, 9};
        mergeSort(arr, 0, 7);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

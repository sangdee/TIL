package inflearn.sort;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/16
 */
public class 퀵정렬 {
    public static void sort(int[] a) {
        pivotSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void pivotSort(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }
        int partition = partition(a, l, r);
        pivotSort(a, l, partition - 1);
        pivotSort(a, partition + 1, r);
    }

    private static int partition(int[] a, int left, int right) {
        int l = left;
        int r = right;
        int pivot = a[right];
        while (l < r) {
            while (a[l] < pivot && l < r) {
                l++;
            }
            while (a[r] >= pivot && l < r) {
                r--;
            }
            swap(a, l, r);
        }
        swap(a, l, right);
        return l;
    }

    private static void swap(int[] a, int l, int r) {
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

    public static void main(String[] args) {
        sort(new int[]{3, 5, 1, 2, 3, 5, 8, 9});
    }
}

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-03 오후 4:53
 */
public class QuickSort {
    /***
     *  평균 시간복잡도 O(N*logN)
     *  퀵 정렬은 하나의 큰 문제를 두 개의 작은 문제로 분할하는 식으로 빠르게 정렬
     *  특정한 값을 기준으로 큰 숫자와 작은 숫자를 서로 교환한 뒤에 배열을 반으로 나눔
     */


    static void quickSort(int[] data, int start, int end) {
        if (start >= end) {
            return;
        }
        int key = start;
        int i = start + 1, j = end, temp;
        while (i <= j) {
            while (i <= end && data[i] >= data[key]) {
                i++;
            }
            while (j > start && data[j] <= data[key]) {
                j--;
            }
            if (i > j) {
                temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            }
            if (i < j) {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        quickSort(data, start, j - 1);
        quickSort(data, j + 1, end);

    }

    public static void main(String[] args) {
        int number = 10;
        int[] data = {3, 5, 4, 1, 2, 9, 8, 7, 6, 10};

        quickSort(data, 0, number - 1);

        for (int i = 0; i < number; i++) {
            System.out.print(data[i] + " ");
        }
    }

}

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-02 오후 7:24
 */
public class InsertSort {
    //시간 복잡도 O(N^2)
    public static void main(String[] args) {
        int temp;
        int[] arr = {1, 4, 2, 3, 5, 7, 8, 6, 10, 9};
        for (int i = 0; i < 9; i++) {
            int j = i;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

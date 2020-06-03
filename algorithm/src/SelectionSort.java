/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-02 오후 5:56
 */
public class SelectionSort {
    //시간 복잡도 O(N^2)
    public static void main(String[] args) {
        int min, index = 0, temp;
        int[] arr = {1, 4, 2, 3, 5, 7, 6, 8, 10, 9};

        for (int i = 0; i < 10; i++) {
            min = Integer.MAX_VALUE;
            for (int j = i; j < 10; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;

                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

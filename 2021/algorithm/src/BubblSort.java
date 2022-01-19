/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-02 오후 6:31
 */
public class BubblSort {
    //시간 복잡도 O(N^2)
    public static void main(String[] args) {
        int temp;
        int[] arr = {3, 2, 1, 5, 6, 7, 4, 9, 8, 10};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

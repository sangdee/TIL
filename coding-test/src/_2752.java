import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-03 오후 6:35
 */
public class _2752 {
    public static void main(String[] args) {

        int min, index = 0, temp;
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }


        for (int i = 0; i < arr.length; i++) {
            min = Integer.MAX_VALUE;
            for (int j = i; j < arr.length ; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
            for (int x : arr){
                System.out.print(x+" ");
            }
    }
}

package lecture.two_pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/21
 */
public class 공통원소구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);

        List<Integer> list = new ArrayList<>();
        int pointer1 = 0, pointer2 = 0;
        while (pointer1 < n && pointer2 < m) {
            if (arr[pointer1] > arr2[pointer2]) {
                pointer2++;
            }else if (arr[pointer1] == arr2[pointer2]){
                list.add(arr[pointer1]);
                pointer1++;
                pointer2++;
            }else {
                pointer1++;
            }
        }
        list.forEach(e-> System.out.print(e + " "));

    }
}

package lecture.array;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/05/06
 */
public class 뒤집은소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            String s = String.valueOf(sc.nextInt()),
                value = "";
            for (int j = s.length() - 1; j >= 0; j--) {
                value += s.charAt(j);
            }
            arr[i] = Integer.parseInt(value);
        }
        for (int i = 0; i < arr.length; i++) {
            if (isEfficiencyPrimeNumber(arr[i])){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static boolean isEfficiencyPrimeNumber(int x) {
        if (x == 0 || x == 1)
            return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

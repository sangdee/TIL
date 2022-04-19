package lecture.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/19
 */
public class 가장짧은문자거리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");

        String string = split[0],
            target = split[1];

        int[] arr = new int[string.length()];
        int answer = 1001;
        for (int i = 0; i < string.length(); i++) {
            if (String.valueOf(string.charAt(i)).equals(target)) {
                answer = 0;
                arr[i] = answer;
            }
            else {
                answer++;
                arr[i] = answer;
            }
        }
        for (int i = string.length() -1 ; i >= 0; i--) {
            if (String.valueOf(string.charAt(i)).equals(target)) {
                answer = 0;
                arr[i] = answer;
            }
            else {
                answer++;
                arr[i] = Math.min(answer,arr[i]);
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}

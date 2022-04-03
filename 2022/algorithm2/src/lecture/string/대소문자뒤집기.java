package lecture.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/03
 */
public class 대소문자뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 97) {
                result += String.valueOf(c).toUpperCase();
            }else {
                result += String.valueOf(c).toLowerCase();
            }
        }
        System.out.println(result);
    }
}

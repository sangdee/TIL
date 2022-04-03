package lecture.string;

import java.util.Scanner;


/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/02
 */
public class 문자찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().toLowerCase();
        String c = sc.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (String.valueOf(string.charAt(i)).equals(c)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

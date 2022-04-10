package lecture.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/10
 */
public class 회문문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int start = 0,
            end = s.length() - 1;
        boolean flag = true;

        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            }
            else {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }
}

package lecture.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/23
 */
public class 암호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        String inCoding = sc.nextLine();
        int start = 0;
        int end = 7;

        String result = "";
        for (int i = 0; i < n; i++) {
            String substring = inCoding.substring(start, end);
            String binary = "";
            for (int j = 0; j < substring.length(); j++) {
                if (substring.charAt(j) == '#') {
                    binary += 1;
                }else {
                    binary += 0;
                }
            }
            result += (char)Integer.parseInt(binary, 2);
            start = end;
            end += 7;
        }
        System.out.println(result);
    }
}

package lecture.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/16
 */
public class 숫자만추출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                    result += c;
            }
        }
        System.out.println(Integer.parseInt(result));

//        int start = 0;
//        for (int i = 0; i < result.length(); i++) {
//            if (result.charAt(i) != '0') {
//                start = i;
//                break;
//            }
//        }
//        System.out.println(result.substring(start));
    }
}

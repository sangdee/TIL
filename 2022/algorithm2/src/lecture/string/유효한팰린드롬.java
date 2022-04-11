package lecture.string;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/11
 */
public class 유효한팰린드롬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        int start = 0,
            end = s.length() - 1;
        boolean fellindrom = true;
        while (start <= end) {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);
            if (Character.isAlphabetic(startChar) &&
                Character.isAlphabetic(endChar)) {
                if (startChar == endChar) {
                    start++;
                    end--;
                }
                else {
                    fellindrom = false;
                    break;
                }
            }
            else if (!Character.isAlphabetic(startChar)) {
                start++;
            }
            else if (!Character.isAlphabetic(endChar)) {
                end--;
            }
        }
        System.out.println(fellindrom ? "YES" : "NO");
    }


    String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) {
            answer = "YES";
        }
        return answer;
    }
}

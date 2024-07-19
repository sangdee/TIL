package algorithm.inflearn.string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2024/01/14
 */
public class 중복문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        for (Character c : set) {
            System.out.print(c);
        }
    }
}

package lecture.implementation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/08
 */
public class 문자열재정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int number = 0;
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                number += c - '0';
            } else {
                stringList.add(String.valueOf(c));
            }
        }
        stringList.sort(Comparator.naturalOrder());
        String result = "";
        for (String string : stringList) {
            result += string;
        }
        System.out.println(result + number);
    }

}

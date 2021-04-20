package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-20
 */
public class 문자열재정렬 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        List<Character> list = new ArrayList<>();
        int number = 0;
        for (char c : inputData.toCharArray()) {
            if (Character.isLetter(c)) {
                list.add(c);
            } else {
                number += c - '0';
            }
        }
        list.sort(null);

        for (char c : list) {
            result.append(c);
        }
        result.append(number);
        System.out.println(result);
    }
}

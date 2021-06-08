package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-08
 */

import java.util.ArrayList;
import java.util.List;

/**
 * expression	            result
 * "100-200*300-500+20"	    60420
 * "50*6-3*2"	            300
 */
public class 수식최대화 {

    public static long solution(String expression) {
        long answer = 0;
        List<String> numbers = new ArrayList<>();
        List<Character> operation = new ArrayList<>();

        char[] chars = expression.toCharArray();

        StringBuilder sum = new StringBuilder();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                sum.append(c);
            } else if (!Character.isDigit(c)) {
                operation.add(c);
                numbers.add(String.valueOf(sum));
                sum.setLength(0);
            }
        }
        numbers.add(String.valueOf(sum));
        System.out.println(numbers);

        long cal = Math.abs(calc('*', '-', '+', new ArrayList<>(numbers), new ArrayList<>(operation)));
        long cal1 = Math.abs(calc('*', '+', '-', new ArrayList<>(numbers), new ArrayList<>(operation)));
        long cal2 = Math.abs(calc('+', '-', '*', new ArrayList<>(numbers), new ArrayList<>(operation)));
        long cal3 = Math.abs(calc('+', '*', '-', new ArrayList<>(numbers), new ArrayList<>(operation)));
        long cal4 = Math.abs(calc('-', '*', '+', new ArrayList<>(numbers), new ArrayList<>(operation)));
        long cal5 = Math.abs(calc('-', '+', '*', new ArrayList<>(numbers), new ArrayList<>(operation)));
        answer = Math.max(cal, Math.max(cal1, Math.max(cal2, Math.max(cal3, Math.max(cal4, cal5)))));
        return answer;
    }

    public static long calc(char a, char b, char c, List<String> numbers, List<Character> operation) {
        while (numbers.size() != 1) {
            if (operation.contains(a)) {
                func(a, numbers, operation);
            } else if (operation.contains(b)) {
                func(b, numbers, operation);
            } else {
                func(c, numbers, operation);
            }
        }
        return Long.parseLong(numbers.get(0));
    }

    public static void func(char c, List<String> numbers, List<Character> operation) {
        int mul = operation.indexOf(c);
        long i;
        if (c == '*') {
            i = Long.parseLong(numbers.get(mul)) * Long.parseLong(numbers.get(mul + 1));
        } else if (c == '+') {
            i = Long.parseLong(numbers.get(mul)) + Long.parseLong(numbers.get(mul + 1));
        } else {
            i = Long.parseLong(numbers.get(mul)) - Long.parseLong(numbers.get(mul + 1));
        }
        operation.remove(mul);
        numbers.remove(mul);
        numbers.remove(mul);
        numbers.add(mul, String.valueOf(i));

    }

    public static void main(String[] args) {
        System.out.println(solution("177-661*999*99-133+221+334+555-166-144-551-166*166-166*166-133*88*55-11*4+55*888*454*12+11-66+444*99"));
    }
}

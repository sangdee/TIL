package baekjoon.function;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/19
 */
public class 셀프넘버 {

    //1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
    //d(75) = 75+7+5 = 87이다.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            list.add(i);
        }
        for (int i = 1; i <= 10000; i++) {
            int constructor = constructor(String.valueOf(i));
            list.stream()
                .filter(m -> m == constructor)
                .findFirst()
                .ifPresent(list::remove);
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
    static int constructor(String s) {
        int temp = Integer.parseInt(s);
        for (int i = 0; i < s.length(); i++) {
            temp += s.charAt(i) - '0';
        }
        return temp;
    }
}

package programmers.고득점kit;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/08
 */
public class 위장 {
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
        }

        for (Integer i : map.values()) {
            answer *= i;
        }

        return answer - 1;
    }

    public int solution2(String[][] clothes) {
        return Arrays.stream(clothes)
            .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
            .values()
            .stream()
            .reduce(1L, (x, y) -> x * (y + 1)).intValue() - 1;
    }

    public static void main(String[] args) {
        String[][] arr = new String[][] {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"},
            {"green_turban", "headgear"}};
        // solution(
        //     new String[][] {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}});

    }
}

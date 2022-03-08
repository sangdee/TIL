package programmers.고득점kit;

import java.util.HashMap;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/08
 */
public class 완주하지못한선수 {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        for (String player : completion)
            map.put(player, map.get(player) - 1);

        String key = map.entrySet().stream()
            .filter(e -> e.getValue() != 0)
            .findFirst()
            .get().getKey();
        return key;
    }

    public static void main(String[] args) {
        solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"});
        // Map<String, Integer> map = Map.of("hi", 1);
        // System.out.println(map.get("2"));
    }
}

package hash;

import java.util.HashMap;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-03
 */
public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String name = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                name = key;
            }

        }
        return name;
    }
}

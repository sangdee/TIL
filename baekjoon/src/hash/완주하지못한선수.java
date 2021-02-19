package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-02-03
 */
public class 완주하지못한선수 {
    public static String solution(String[] participant, String[] completion) {
        String name = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                name = participant[i];
                break;
            }
        }

        return name;
    }

    public static void main(String[] args) {
        String[] arr1 = {"mislav", "stanko", "mislav", "ana"};
        String[] arr2 = {"stanko", "ana", "mislav"};

        solution(arr1, arr2);
    }


//    public String solution(String[] participant, String[] completion) {
//        String name = "";
//        HashMap<String, Integer> map = new HashMap<>();
//        for (String player : participant) {
//            map.put(player, map.getOrDefault(player, 0) + 1);
//        }
//        for (String player : completion) {
//            map.put(player, map.get(player) - 1);
//        }
//        for (String key : map.keySet()) {
//            if (map.get(key) != 0) {
//                name = key;
//            }
//
//        }
//        return name;
//    }
}

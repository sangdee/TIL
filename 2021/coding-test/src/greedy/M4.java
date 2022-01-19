package greedy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class M4 {

    static int solution(String[] id_list, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : id_list) {
            String[] split = s.split(" ");
            Set<String> exist = new HashSet<>();
            for (String i : split) {
                if (!exist.contains(i)) {
                    if (map.get(i) == null) {
                        map.put(i, 1);
                    } else {
                        map.put(i, Math.min(k, map.get(i) + 1));
                    }
                }

                exist.add(i);
            }
        }

        int result = 0;
        for (int i : map.values()) {
            result += i;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] array1 = {"A B C D", "A D", "A B D", "B D"};
        int output1 = solution(array1, 2);
        System.out.println(output1);

        String[] array2 = {"JAY", "JAY ELLE JAY MAY", "MAY ELLE MAY ELLE MAY", "ELLE ELLE ELLE", "MAY"};
        int output2 = solution(array2, 3);
        System.out.println(output2);
    }
}

package programmers_lv2;

import java.util.*;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-04
 */
public class 메뉴리뉴얼_2 {
    private static List<String> combination;

    public static String[] solution(String[] orders, int[] course) {
        String[] answer;
        combination = new ArrayList<>();

        for (int i = 0; i < orders.length; i++) {   // 한 주문당 모든 조합 구하기
            char[] orders_char = orders[i].toCharArray();
            Arrays.sort(orders_char);
            for (int index = 0; index < orders_char.length - 1; index++) {  // 차례대로 한글자씩 선택 후
                for (int j = 0; j < course.length; j++) {   // course 에 있는 모든 경우
                    dfs(orders_char, index, 1, course[j], String.valueOf(orders_char[index]));
                }
            }
        }

        Map<String, Integer> map = new HashMap<>();
        for (String key : combination) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        List<String> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

        List<String> ansList = new ArrayList<>();
        for (int i = 0; i < course.length; i++) {
            int max_value = 0;

            for (String key : keySetList) {
                if (map.get(key) >= 2 && key.length() == course[i]) {
                    if (map.get(key) >= max_value) {
                        ansList.add(key);
                        max_value = map.get(key);
                    }
                }
            }
        }
        Collections.sort(ansList);
        answer = new String[ansList.size()];
        ansList.toArray(answer);

        return answer;
    }

    public static void dfs(char[] arr, int idx, int length, int course, String str) {
        if (length == course) {    // 경우의 수 추가
            combination.add(str);
        }

        for (int i = idx + 1; i < arr.length; i++) {
            dfs(arr, i, length + 1, course, str + arr[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"ABCD", "ABCD", "ABCD"}, new int[]{
                2, 3, 4
        })));
    }
}

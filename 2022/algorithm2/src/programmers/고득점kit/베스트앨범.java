package programmers.고득점kit;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/08
 */
public class 베스트앨범 {
    public static int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        List<Map.Entry<String, Integer>> entryList =
            map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(toList());
        for (int i = entryList.size() - 1; i >= 0; i--) {
            List<Integer> indexList = new ArrayList<>();
            Map.Entry<String, Integer> selectedEntry = entryList.get(i);
            String key = selectedEntry.getKey();
            for (int j = 0; j < genres.length; j++) {
                if (key.equals(genres[j])) {
                    indexList.add(j);
                }
            }
            List<Integer> values =
                indexList.stream()
                    .map(index -> plays[index])
                    .sorted(Comparator.reverseOrder())
                    .limit(2)
                    .collect(toList());
            int count = 0;
            for (Integer value : values) {
                for (Integer index : indexList) {
                    if (plays[index] == value) {
                        if (count > 1) {
                            break;
                        }
                        count++;
                        answer.add(index);
                    }
                }
            }
        }
        int size = answer.size();
        int[] answerArr = new int[size];
        for (int i = 0; i < size; i++) {
            answerArr[i] = answer.get(i);
        }
        return answerArr;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[] {"classic", "pop", "classic", "classic", "pop"},
            new int[] {500, 600, 150, 800, 2500}));
    }
}

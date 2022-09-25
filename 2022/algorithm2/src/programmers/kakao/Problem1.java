package programmers.kakao;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/24
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 오늘 날짜를 어레이로 담고, terms 를 맵으로 담고, 프라이버씨를 하나씩 가져와서 맵에서 개월 수를
 * 가져와서 프라이버씨 달에 더하고 달이 13이상이면 년을 1 올리고
 * 오늘보다 프라이버시가 작으면 파기해야하므로 인덱스를 리스트에 담아 배열로 리턴
 */
public class Problem1 {
    public static int[] solution(String today, String[] terms, String[] privacies) {
        String[] todayArr = today.split("\\.");//2022 05 19
        List<Integer> results = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String s : terms) {
            String[] split = s.split(" ");
            map.put(split[0], Integer.valueOf(split[1]));
        }
        for (int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            String[] dayAndType = privacy.split(" ");
            String[] day = dayAndType[0].split("\\.");

            Integer term = map.get(dayAndType[1]);
            if (Integer.parseInt(day[1]) + term > 12) {
                day[0] = String.valueOf(Integer.parseInt(day[0]) + 1);
                day[1] = String.valueOf(Integer.parseInt(day[1]) + term - 12);
            } else {
                day[1] = String.valueOf(Integer.parseInt(day[1]) + term);
            }

            if (Integer.parseInt(day[2]) != 1) {
                day[2] = String.valueOf(Integer.parseInt(day[2]) - 1);
            } else {
                day[1] = String.valueOf(Integer.parseInt(day[1]) - 1);
                day[2] = "28";
            }

            if (Integer.parseInt(todayArr[0]) > Integer.parseInt(day[0])) {
                results.add(i + 1);
            } else if (Integer.parseInt(todayArr[0]) == Integer.parseInt(day[0])) {
                if (Integer.parseInt(todayArr[1]) > Integer.parseInt(day[1])) {
                    results.add(i + 1);
                } else if (Integer.parseInt(todayArr[1]) == Integer.parseInt(day[1])) {
                    if (Integer.parseInt(todayArr[2]) > Integer.parseInt(day[2])) {
                        results.add(i + 1);
                    }
                }
            }
        }
        int[] arr = new int[results.size()];
        for (int i = 0; i < results.size(); i++) {
            arr[i] = results.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(solution("2020.01.01", new String[]{"Z 3", "D 5"},
                                     new String[]{"2019.01.01 D",
                                                  "2019.11.15 Z",
                                                  "2019.08.02 D",
                                                  "2019.07.01 D",
                                                  "2018.12.28 Z"

                                     })));
    }
}

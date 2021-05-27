package hash;

import java.util.HashMap;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-26
 */
public class 위장_2 {
    /**
     * ["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]]	5
     * 경우의 수를 구하는 공식은 4종류의 옷과 그 옷이 {n, m, o, p}의 개수로 있을 때 아래와 같다.
     * <p>
     * (n + 1) * (m + 1) * (o + 1) * (p + 1) - 1
     * 각 종류들은 하나를 입거나, 안입거나의 선택지가 있기 때문에 옷의 개수에 안입는 선택지를 하나 추가한다.
     * 그리고 옷을 고르는 선택은 동시에 일어나는 일이기 때문에, 각 옷들을 곱해 경우의 수를 계산한다.
     * 이 때, 하나도 안입는 선택지는 없으므로 그 경우의 수 하나를 뺀다.
     */
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
        }

        for (int value : map.values()) {
            answer *= value;
        }
        return answer - 1;
    }
}

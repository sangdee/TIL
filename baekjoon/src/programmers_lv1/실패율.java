package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-28
 */


import java.util.*;

/**
 * N	stages	result
 * 5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
 * 4	[4,4,4,4,4]	[4,1,2,3]
 */
public class 실패율 {
    public static int[] solution(int N, int[] stages) {
        double[] answer = new double[N];
        int[] result = new int[N];

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] <= N) {
                answer[stages[i] - 1]++;
            }
        }
        // 1 ,3, 2, 1 ,0
        for (int i = 0; i < answer.length; i++) {
            int count = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] > i) {
                    count++;
                }
            }
            if (count == 0) {
                answer[i] = 0;
            } else {
                answer[i] /= count;
            }
        }
        Arrays.stream(answer).forEach(System.out::println);
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < answer.length; i++) {
            map.put(i + 1, answer[i]);
        }
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (int i = 0; i < list.size(); i++) {
            String s = String.valueOf(list.get(i));
            String[] val = s.split("=", 0);
            System.out.println("val[0] = " + val[0]);
            result[i] = Integer.parseInt(val[0]);
        }

        return result;
    }

    public static void main(String[] args) {
//        N = 5
//stages = [2,1,2,4,2,4,3,3]
        System.out.println(solution(5, new int[]{2, 1, 2, 4, 2, 4, 3, 3}));
    }
}

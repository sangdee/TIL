package algorithm.inflearn.greedy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/07/05
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 현수는 유명한 강연자이다. N개이 기업에서 강연 요청을 해왔다. 각 기업은 D일 안에 와서 강연을 해 주면 M만큼의 강연료를 주기로 했다.
 * <p>
 * 각 기업이 요청한 D와 M를 바탕으로 가장 많을 돈을 벌 수 있도록 강연 스케쥴을 짜야 한다.
 * <p>
 * 단 강연의 특성상 현수는 하루에 하나의 기업에서만 강연을 할 수 있다.
 * <p>
 * <p>
 * 입력 첫 번째 줄에 자연수 N(1<=N<=10,000)이 주어지고, 다음 N개의 줄에 M(1<=M<=10,000)과 D(1<=D<=10,000)가 차례로 주어진다.
 * <p>
 * <p>
 * 출력 첫 번째 줄에 최대로 벌 수 있는 수입을 출력한다.
 */
public class 최대수입스케쥴 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Lecture> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Lecture(sc.nextInt(), sc.nextInt()));
        }
        System.out.println(solution(list));

    }

    private static int solution(List<Lecture> list) {
        int answer = 0;
        Collections.sort(list);
        int max = list.get(0).day;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = max; i > 0; i--) {
            for (Lecture lecture : list) {
                if (lecture.day < i) {
                    break;
                }
                if (lecture.day == i) {
                    pq.offer(lecture.pay);
                }
            }
            if (!pq.isEmpty()) {
                answer += pq.poll();
            }
        }
        return answer;
    }

    static class Lecture implements Comparable<Lecture> {
        int pay;
        int day;

        public int getPay() {
            return pay;
        }

        public int getDay() {
            return day;
        }

        public Lecture(int pay, int day) {
            this.pay = pay;
            this.day = day;
        }

        @Override
        public int compareTo(Lecture o) {
            return o.day - this.day;
        }
    }
}

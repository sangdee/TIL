package algorithm.inflearn.greedy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/07/03
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 한 개의 회의실이 있는데 이를 사용하고자 하는 n개의 회의들에 대하여 회의실 사용표를 만들려고 한다.
 * <p>
 * 각 회의에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 최대수의 회의를 찾아라.
 * <p>
 * 단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다. 5 1 4 2 3 3 5 4 6 5 7
 * <p>
 * result 3
 */
public class 회의실배정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 회의 수
        List<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            list.add(new Time(start, end));
        }
        System.out.println(solution(list, n));
    }

    public static int solution(List<Time> list, int n) {
        int answer = 0;
        list.sort(Time::compareTo);
        int et = 0;
        for (Time time : list) {
            if (time.start >= et) {
                answer++;
                et = time.end;
            }
        }
        return answer;
    }

    static class Time implements Comparable<Time> {
        int start;
        int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            if (this.end == o.end) {
                return this.start - o.start;
            } else {
                return this.end - o.end;
            }
        }
    }
}

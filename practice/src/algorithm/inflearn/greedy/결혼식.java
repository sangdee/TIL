package algorithm.inflearn.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/07/04
 */
public class 결혼식 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Time(sc.nextInt(), 's'));
            list.add(new Time(sc.nextInt(), 'e'));
        }
        System.out.println(solution(list));
    }

    private static int solution(List<Time> list) {
        int answer = 0;
        Collections.sort(list);
        int count = 0;
        for (Time time : list) {
            if (time.state == 's') {
                count++;
            } else {
                count--;
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }

    static class Time implements Comparable<Time> {
        int time;
        char state;

        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time time) {
            if (this.time == time.time) {
                return this.state - time.state;
            } else {
                return this.time - time.time;
            }
        }
    }
}


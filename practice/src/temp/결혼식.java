package temp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 결혼식 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Time(sc.nextInt(), 's'));
            list.add(new Time(sc.nextInt(), 'e'));
        }
        // 14 15 18 20 30
        // 5 12 14 15 20
        list.sort(Comparator.comparing(Time::getTime)
                            .thenComparing(Time::getStatus));

        int count = 0;
        int result = 0;
        for (Time time : list) {
            if (time.getStatus() == ('s')) {
                count++;
                result = Math.max(result, count);
            } else {
                count--;
            }
        }

        System.out.println(result);

    }

    static class Time {
        private int time;
        private char status;

        public Time(int start, char end) {
            this.time = start;
            this.status = end;
        }

        public int getTime() {
            return time;
        }

        public char getStatus() {
            return status;
        }
    }
}

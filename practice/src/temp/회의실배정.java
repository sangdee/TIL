package temp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 회의실배정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Time(sc.nextInt(), sc.nextInt()));
        }
        list.sort(Comparator.comparing(Time::getEnd)
                            .thenComparing(Time::getStart));

        int count = 0;
        int endTime = 0;
        for (Time time : list) {
            if (time.getStart() >= endTime) {
                count++;
                endTime = time.getEnd();
            }
        }

        System.out.println(count);

    }

    static class Time {
        private int start;

        private int end;

        public Time(int start, int period) {
            this.start = start;
            this.end = period;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}

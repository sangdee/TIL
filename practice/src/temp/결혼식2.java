package temp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 결혼식2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Time(sc.nextInt(), sc.nextInt()));
        }
        // 14 15 18 20 30
        // 5 12 14 15 20
        list.sort(Comparator.comparing(Time::getEnd, Comparator.reverseOrder()));

        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getStart() < list.get(j).getEnd()) {
                    count++;
                    result = Math.max(result, count);
                }
            }
        }

        System.out.println(result);

    }

    static class Time {
        private int start;
        private int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}

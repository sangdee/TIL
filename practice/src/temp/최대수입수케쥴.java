package temp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

//D일안에 와서 M만큼 강의수수료
public class 최대수입수케쥴 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Data> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Data(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list, Comparator.comparing(Data::getDay, Comparator.reverseOrder()));
        //        list.sort(Comparator.comparing(Data::getDay, Comparator.reverseOrder()));
        int max = list.get(0).day;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int result = 0;
        for (int i = max; i > 0; i--) {
            for (Data data : list) {
                if (data.day == i) {
                    pq.offer(data.price);
                }
                if (data.day < i) {
                    break;
                }
            }
            if (!pq.isEmpty()) {
                result += pq.poll();
            }
        }
        System.out.println(result);
    }

    static class Data {
        private int price;
        private int day;

        public int getDay() {
            return day;
        }

        public int getPrice() {
            return price;
        }

        public Data(int price, int day) {
            this.day = day;
            this.price = price;
        }
    }
}

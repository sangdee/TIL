package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 회의실배정2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Arrays.asList(sc.nextInt(), sc.nextInt()));
        }
        list.sort(Comparator.comparing((List<Integer> e) -> e.get(1))
                            .thenComparing(e -> e.get(0)));

        int count = 0;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max <= list.get(i).get(0)) {
                max = list.get(i).get(1);
                count++;
            }
        }
        System.out.println(count);
    }
}

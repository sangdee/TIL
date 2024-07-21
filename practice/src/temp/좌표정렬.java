package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 좌표정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>(Arrays.asList(sc.nextInt(), sc.nextInt())));
        }
        list.sort(((o1, o2) -> {
            if (o1.get(0) > o2.get(0)) {
                return 1;
            } else if (o1.get(0).equals(o2.get(0))) {
                if (o1.get(1) > o2.get(1)) {
                    return 1;
                }
            }
            return -1;
        }));

        for (List<Integer> integers : list) {
            System.out.println(integers.get(0) + " " + integers.get(1));
        }
    }
}

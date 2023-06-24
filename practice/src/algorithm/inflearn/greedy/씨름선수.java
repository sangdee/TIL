package algorithm.inflearn.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/06/24
 */
public class 씨름선수 {
    public static void main(String[] args) {
        씨름선수 c = new 씨름선수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Body> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            list.add(new Body(h, w));
        }
        System.out.println(c.solution(list, n));
    }

    private int solution(List<Body> list, int n) {
        int count = 0;
        list.sort(Body::compareTo);
        int max = Integer.MIN_VALUE;
        for (Body body : list) {
            if (body.w > max) {
                max = body.w;
                count++;
            }
        }
        return count;
    }
}

class Body implements Comparable<Body> {
    public int h, w;

    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h - this.h;
    }
}

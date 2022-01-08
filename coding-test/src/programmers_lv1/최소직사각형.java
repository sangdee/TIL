package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/08
 */
public class 최소직사각형 {

    //  [[60, 50], [30, 70], [60, 30], [80, 40]]
    public static int solution(int[][] sizes) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < sizes.length; i++) {
            x = Math.max(x, Math.max(sizes[i][0], sizes[i][1]));
            y = Math.max(y, Math.min(sizes[i][0], sizes[i][1]));
        }
        return x * y;
    }

    public static void main(String[] args) {
        solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});

    }
}

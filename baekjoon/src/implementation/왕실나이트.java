package implementation;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-20
 */
public class 왕실나이트 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int row = s.charAt(1) - '0';
        int column = s.charAt(0) - 'a' + 1;

        int[] dx = {-1, 1, -1, 1, 2, 2, -2, -2};
        int[] dy = {-2, -2, 2, 2, -1, 1, -1, 1};

        int count = 0;
        for (int i = 0; i < dx.length; i++) {
            int nx, ny = 0;
            nx = row + dx[i];
            ny = column + dy[i];

            if (nx > 0 && ny > 0 && nx < 9 && ny < 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}

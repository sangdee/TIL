package lecture.implementation;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/05
 */
public class 상하좌우 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] directions = sc.nextLine().split(" ");

        int x = 1, y = 1;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        String[] moveType = {"L", "R", "U", "D"};

        for (int i = 0; i < directions.length; i++) {
            String direction = directions[i];

            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (direction.equals(moveType[j])) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if (nx < 1 || ny < 1 || nx > n || ny > n) {
                continue;
            }
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }

}

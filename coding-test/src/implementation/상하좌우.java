package implementation;

import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-04-20
 */
public class 상하좌우 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // 수를 받고 문자열을 받으려면 반드시 버퍼를 비워야함

        String[] plans = scanner.nextLine().split(" ");
        int x = 1, y = 1;

        //L,R,U,D에 따른 이동 방향
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        //이동 계획을 하나씩 확인
        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);

            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if (!(nx < 1 || ny < 1 || nx > n || ny > n)) {
                x = nx;
                y = ny;
            }

        }

        System.out.println(x + " " + y);
    }
}

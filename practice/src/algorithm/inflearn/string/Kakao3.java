package algorithm.inflearn.string;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2024/01/14
 */

/**
 * 당신은 비행기 좌석 예약을 처리하고 있다. 비행기에는 1번부터n번까지 번호가 매겨진 좌석이 n줄이 있다. 아래 그림과 같이 각 줄에는 좌석이 열(10)석 있다.
 * 일부 좌석은 이미 예약되어있다. 예약좌석 목록은 "1A 3C 2B 20G 5A"와 같이 한개의 공백으로 구분된 좌석 번호를 포함하는 문자열 S(길이M)로 주어진다. S에 나열된 예약 좌석의 순서는 임의적이다.
 * 최대한 많은 4인 가족에게 좌석을 배정하시오. 4인 가족은 한줄에서 서로 인접한 네 좌석을 사용하며 통로를 사이에 둔 좌석들(2C와 2D)은 서로 인접한 것으로 간주하지 않는다. 통로를 사이에 두고 가족을 분리할 수 있지만 이 경우에는 반두시 두사람이 통로 양쪽에 앉아야 한다. 어떤 좌석도 한 가족 이상에게 배정할  수 없다.
 * public int solution(int N, String S) {
 * // Implement your solution here
 * }
 * 줄 개수 n과 예약좌석목록 문자열S가 주어졌을 때, 남은 미예약 좌석에 앉을 수 있는 4인 가족의 최대수를 반환해야한다.
 * 예를들어 N=2, s="1A 2F 1C"일때 함수는 2를 반환해야한다.
 * 좌석은 ABC DEFG HJK와 같이 3, 4,3으로 되어있어
 */
public class Kakao3 {
    public static void main(String[] args) {
        //        System.out.println(solution(1, ""));
        System.out.println(solution(22, "1A 3C 2B 20G 5A"));
    }

    public static int solution(int N, String S) {
        boolean[][] seats = new boolean[N + 1][10];
        String[] reserved = S.split(" ");
        for (String seat : reserved) {
            if (seat.length() > 0) {
                int row = Integer.parseInt(seat.substring(0, seat.length() - 1));
                int col = seat.charAt(seat.length() - 1) - 'A';
                seats[row][col] = true;
            }
        }

        int families = 0;
        for (int i = 1; i <= N; i++) {
            if (!seats[i][1] && !seats[i][2] && !seats[i][3] && !seats[i][4]) {
                seats[i][1] = seats[i][2] = seats[i][3] = seats[i][4] = true;
                families++;
            }
            if (!seats[i][3] && !seats[i][4] && !seats[i][5] && !seats[i][6]) {
                seats[i][3] = seats[i][4] = seats[i][5] = seats[i][6] = true;
                families++;
            }
            if (!seats[i][5] && !seats[i][6] && !seats[i][7] && !seats[i][8]) {
                seats[i][5] = seats[i][6] = seats[i][7] = seats[i][8] = true;
                families++;
            }
        }

        return families;
    }
}

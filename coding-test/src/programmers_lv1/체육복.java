package programmers_lv1;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-27
 */

/**
 * 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
 * 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
 * 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
 */

//2, 3   3,4
public class 체육복 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int count = 0;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = reserve[j] = -1;
                    count++;
                    break;
                }

            }
        }
        for (int lostNum : lost) {
            if (lostNum != -1) {
                for (int i = 0; i < reserve.length; i++) {
                    if (lostNum == reserve[i] - 1 || lostNum == reserve[i] + 1) {
                        reserve[i] = -1;
                        count++;
                        break;
                    }
                }
            }

        }
        int i = lost.length - count;

        return n - i;
    }
}

// public static int solution(int n, int[] lost, int[] reserve) {
//        int answer = n - lost.length;
//
//        for (int i = 0; i < lost.length; i++) {
//            for (int j = 0; j < reserve.length; j++) {
//                if (lost[i] == reserve[j]) {
//                    answer++;
//                    lost[i] = reserve[j] = -1;
//                    break;
//                }
//            }
//        }
//
//        for (int lostPerson : lost) {
//            for (int i = 0; i < reserve.length; i++) {
//                if (reserve[i] == lostPerson + 1 || reserve[i] == lostPerson - 1) {
//                    answer++;
//                    reserve[i] = -1;
//                    break;
//                }
//            }
//        }
//        return answer;
//    }
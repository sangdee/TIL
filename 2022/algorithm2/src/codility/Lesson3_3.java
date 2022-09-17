package codility;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/17
 */
public class Lesson3_3 {
    //    A[0] = 3
//    A[1] = 1
//    A[2] = 2
//    A[3] = 4
//    A[4] = 3
//
//    P = 1, difference = |3 − 10| = 7
//    P = 2, difference = |4 − 9| = 5
//    P = 3, difference = |6 − 7| = 1
//    P = 4, difference = |10 − 3| = 7
    public int solution(int[] A) {
        int left = A[0];
        int total = 0;
        for (int i = 0; i < A.length; i++) {
            total += A[i];
        }
        int result = total - left;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            result = Math.min(result, Math.abs(sum - (total - sum)));
        }

        return result;
    }

    public static void main(String[] args) {
        Lesson3_3 lesson3_3 = new Lesson3_3();
//        System.out.println(lesson3_3.solution(new int[]{3, 1, 2, 4, 3}));
        System.out.println(lesson3_3.solution(new int[]{3, 4}));
    }
}

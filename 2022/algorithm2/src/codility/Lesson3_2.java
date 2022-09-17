package codility;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/17
 */
public class Lesson3_2 {
    //    A[0] = 2
//    A[1] = 3
//    A[2] = 1
//    A[3] = 5
    //  n x (n + 1) / 2
    public int solution(int[] A) {
        long length = A.length + 1;
        long i = length * (length + 1) / 2;
        long sum = Arrays.stream(A).sum();

        return (int)(i - sum);
    }

    public static void main(String[] args) {
        Lesson3_2 lesson3_2 = new Lesson3_2();
        System.out.println(lesson3_2.solution(new int[]{2, 3, 1, 5}));
    }
}

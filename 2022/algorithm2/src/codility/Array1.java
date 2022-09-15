package codility;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/15
 */
public class Array1 {
    public static int[] solution(int[] A, int K) {
        int[] arr = new int[A.length];
        for(int i = 0; i < A.length; i++){
            arr[(i + K) % A.length] = A[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        solution(new int[]{3, 8, 9, 7, 6}, 3);
    }
}

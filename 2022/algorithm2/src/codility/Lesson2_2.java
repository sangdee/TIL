package codility;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/16
 */
public class Lesson2_2 {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            if(set.contains(A[i])){
                set.remove(A[i]);
            } else {
                set.add(A[i]);
            }
        }
        return set.stream().findFirst().get();
    }

    //    A[0] = 9  A[1] = 3  A[2] = 9
//    A[3] = 3  A[4] = 9  A[5] = 7
//    A[6] = 9
    public static void main(String[] args) {
        Lesson2_2 lesson2_2 = new Lesson2_2();
        lesson2_2.solution(new int[]{9, 3, 9, 3, 9, 7, 9});
    }
}

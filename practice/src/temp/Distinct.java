package temp;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public int solution(int[] A) {
        // Implement your solution here
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        return set.size();
    }
}

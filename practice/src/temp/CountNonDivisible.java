package temp;

public class CountNonDivisible {
    public int[] solution(int[] A) {
        // Implement your solution here
        int[] arr = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (i != j) {
                    if (A[i] < A[j]) {
                        count++;
                    } else {
                        int sum = A[j];
                        while (sum < A[i]) {
                            if (sum != A[i]) {
                                sum += A[j];
                            }
                        }
                        if (sum != A[i]) {
                            count++;
                        }
                    }
                }
            }
            arr[i] = count;
        }

        return arr;
    }

}

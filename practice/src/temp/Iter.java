package temp;

public class Iter {
    public static int solution(int N) {
        // Implement your solution here

        String s = Integer.toBinaryString(N);
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count++;

            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(solution(32));
    }
}

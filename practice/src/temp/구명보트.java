package temp;

import java.util.Arrays;

//50 50 70 80
public class 구명보트 {
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0, end = people.length - 1;
        int count = 0;
        while (start < end) {
            if (people[start] + people[end] > limit) {
                end--;
                count++;
            } else {
                start++;
                end--;
                count++;
            }
        }
        if (people.length % 2 == 1 || (start == 0 && people.length > 1 && people[0] + people[1] > limit)) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{100, 100, 100, 100, 100, 70}, 100));
    }
}

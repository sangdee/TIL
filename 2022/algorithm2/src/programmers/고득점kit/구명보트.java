package programmers.고득점kit;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/04/02
 */
public class 구명보트 {
    public static int solution(int[] people, int limit) {
        int count = 0;
        int min = 0;
        Arrays.sort(people);

        for (int max = people.length - 1; min <= max; max--) {
            if (people[min] + people[max] <= limit) {
                min++;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        solution(new int[] {70, 50, 80, 50}, 100);
    }
}

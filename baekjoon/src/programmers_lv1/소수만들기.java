package programmers_lv1;

import java.util.ArrayList;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-05-28
 */

/**
 * nums	result
 * [1,2,3,4]	1
 * [1,2,7,6,4]	4
 */
public class 소수만들기 {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length * 1000;
        ArrayList<Integer> prime_nums = new ArrayList<>();
        boolean[] prime = new boolean[n + 1];

        prime[0] = prime[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!prime[i])
                prime_nums.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (prime_nums.contains(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

}

//5
//public Boolean isPrime(int num){
//        int cnt = 0;
//        for(int i = 1; i <= (int)Math.sqrt(num); i ++){
//            if(num % i == 0) cnt += 1;
//        }
//        return cnt == 1;
//    }
// 25
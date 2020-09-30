/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-09-27 오후 3:27
 */
public class 체육복 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        int count = 0;
        int lost_ =0;
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost_ ++ ;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] + 1  == reserve[j] || lost[i] -1 == reserve[j]){
                        reserve[j] = -1;
                        count++;
                        break;
                }
            }
        }
        System.out.println(answer + count + lost_);
        return answer + count + lost_;
    }


    public static void main(String[] args) {
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        solution(5, lost, reserve);
    }
}

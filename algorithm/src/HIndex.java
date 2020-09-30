import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-09-27 오후 2:14
 */
public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        //[0,1,3,5,6]
        for (int i = 0; i <citations.length ; i++) {
            int max = citations.length - i;
            //5,4,3,2,1
            if (max <= citations[i]){
                answer = max;
                break;
            }
        }
        return answer;
    }
}

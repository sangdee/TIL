package programmers.고득점kit;

import java.util.Arrays;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/22
 */
public class Hindex {
    //논문 n편중 h번 이상 인용된 논문이 h편 나머지 논문이 h번 이하면 h의 최대값
    //[1,2,5,5,5]
    //[3, 0, 6, 1, 5]	3
    //[0,1,3,5,6] 3
    int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        for (int i = 0; i < citations.length; i++) {
            int max = citations.length - i;
            if (citations[i] >= max){
                answer = max;
                break;
            }
        }
        return answer;
    }
}
//
// /*
//  n개 논문
//  h번 이상 인용된 h편 -> max(h) : H-index
//
//  citations = [4, 1, 2, 6, 7, 5, 4, 2]
//
//  7번 이상 인용 개수 = 1
//  6번 이상 인용 개수 = 2
//  5번 이상 인용 개수 = 3
//  4번 이상 인용 개수 = 5 -> H-index
//  */
// public int solution(int[] citations) {
//     int answer = 0;
//     Arrays.sort(citations);
//     //[0,1,3,5,6]
//     for (int i = 0; i <citations.length ; i++) {
//         int max = citations.length - i;
//         //5,4,3,2,1
//         if (max <= citations[i]){
//             answer = max;
//             break;
//         }
//     }
//
//     return answer;
// }
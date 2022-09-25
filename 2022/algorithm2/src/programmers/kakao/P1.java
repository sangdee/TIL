package programmers.kakao;

import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/25
 */
public class P1 {
    /**
     * 내 위치에서 재료가 같은지 확인 그렇지 않을 경우
     * 리스트에서 타켓 재료의 인덱스를 확인
     * 5번째 인덱스에 있고 내가 2 번 인덱스면 우측 3번이고 좌측 3번 0 1 [2] 3 4 <5>
     * 인덱스가 내 위치보다 클때 우측 이동 시 :  타겟인덱스 - 현재 위치
     * 좌측 이동 시 : 현재위치 + (리스트의 총 길이 - 타겟의 위치)
     *
     * 0번째 인덱스에 있고 내가 2 번 인덱스면 우측 4번이고 좌측 2번 <0> 1 [2] 3 4 5
     * 인덱스가 내 위치보다 작을 경우 우측 이동 시  : (리스트의 총 길이 - 현재 위치) + 타겟의 위치 // 6-2 +0
     * 좌측 이동 시 :  현재 위치 - 타겟 위치
     *
     * @param ingredients
     * @param startIndex
     * @param target
     * @return
     */
    public static int solution(List<String> ingredients, int startIndex, String target) {
        int targetIndex = 0;

        if (ingredients.get(startIndex).equals(target)) {
            return 0;
        }
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).equals(target)) {
                targetIndex = i;
            }
        }
        System.out.println(targetIndex + " " + startIndex);
        if (targetIndex > startIndex) {
            return Math.min((targetIndex - startIndex), startIndex + (ingredients.size() - targetIndex));
        } else {
            return Math.min((ingredients.size() - startIndex + targetIndex), startIndex - targetIndex);
        }
    }

    public static void main(String[] args) {

    }
}

package programmers_lv2;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-02
 */

import java.util.HashMap;

/**
 * n	data	answer
 * 2	["N~F=0", "R~T>2"]	3648
 * 2	["M~C<2", "C~M>1"]	0
 */
public class 단체사진찍기 {
    HashMap<Character, Integer> map;
    int n;
    String[] data;

    public int solution(int n, String[] data) {
        int answer;
        this.map = new HashMap<>();
        this.n = n;
        this.data = data;

        map.put('A', 1);
        map.put('C', 2);
        map.put('F', 3);
        map.put('J', 4);
        map.put('M', 5);
        map.put('N', 6);
        map.put('R', 7);
        map.put('T', 8);
        answer = makeCase(0, new int[8], new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        return answer;
    }

    int makeCase(int idx, int[] aCase, int[] left) {
        int cnt = 0;
        if (idx == 8) {
            cnt += check(aCase);
        }
        for (int i = 0; i < 8; i++) {
            if (left[i] != 0) {
                aCase[idx] = left[i];
                left[i] = 0;
                cnt += makeCase(idx + 1, aCase, left);
                left[i] = aCase[idx];
                aCase[idx] = 0;
            }
        }
        return cnt;
    }

    int check(int[] aCase) {
        int A_index = 0, B_index = 0;
        for (int i = 0; i < n; i++) {
            int A = map.get(this.data[i].charAt(0));
            int B = map.get(this.data[i].charAt(2));
            char con = this.data[i].charAt(3);
            int dist = this.data[i].charAt(4) - '0' + 1;

            for (int j = 0; j < 8; j++) {
                if (aCase[j] == A)
                    A_index = j;
                else if (aCase[j] == B)
                    B_index = j;
            }

            if (con == '>') {
                if (Math.abs(A_index - B_index) <= dist)
                    return 0;
            } else if (con == '<') {
                if (Math.abs(A_index - B_index) >= dist)
                    return 0;
            } else {
                if (Math.abs(A_index - B_index) != dist)
                    return 0;
            }
        }
        return 1;
    }
}

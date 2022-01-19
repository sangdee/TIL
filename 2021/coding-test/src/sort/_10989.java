package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-01-31
 */
public class _10989 {
    public static final int MAX_VALUE = 10000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[MAX_VALUE + 1];

        for (int i = 0; i < n; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }

        br.close();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < MAX_VALUE + 1; i++) {
//            for (int j = 0; j < cnt[i]; j++) {
//                sb.append(i).append('\n');
//            }
            while (cnt[i] > 0) {
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}

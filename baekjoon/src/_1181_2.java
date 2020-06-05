import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-05 오후 6:56
 */
public class _1181_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new TreeSet<>(
                (s1, s2) -> {
                    int l1 = s1.length(), l2 = s2.length();
                    if (s1.equals(s2)) return 0;
                    if (l1 == l2) return s1.compareTo(s2);
                    return l1 - l2;
                }
        );

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            set.add(br.readLine());
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}

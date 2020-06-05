import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-05 오후 5:56
 */
public class _1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new TreeSet<>();

        int num = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < num; i++) {
            set.add(br.readLine().trim());
        }
        List<String> list = new ArrayList<>(set);
        list.sort((Comparator.comparingInt(String::length)));

        for (String s : list) {
            System.out.println(s);
        }
    }
}

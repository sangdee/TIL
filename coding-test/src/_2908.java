import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/12/11
 */
public class _2908 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(" ");
        Integer convert0 = convert(split[0]);
        Integer convert1 = convert(split[1]);

        if (convert0 > convert1) {
            System.out.println(convert0);
        }else {
            System.out.println(convert1);
        }

    }

    public static Integer convert(String s) {
        List<Character> characterList = new ArrayList<>();
        String result = "";
        for (char c : s.toCharArray()) {
            characterList.add(c);
        }
        for (int i = characterList.size() -1 ; i >= 0; i--) {
            result += characterList.get(i);
        }
        return Integer.parseInt(result);
    }
}

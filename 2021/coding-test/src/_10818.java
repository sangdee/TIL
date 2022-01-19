import java.util.Arrays;
import java.util.Scanner;

public class _10818 {

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        int[] list = new int[num];

        for (int i = 0; i < num; i++) {
            list[i] = scanner.nextInt();
        }

        Arrays.sort(list);

        System.out.println(list[0] + " " + list[list.length -1] );
    }
}

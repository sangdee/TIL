import java.util.Scanner;

public class ct_implementation_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // 수를 받고 문자열을 받으려면 반드시 버퍼를 비워야함
        String[] plans = scanner.nextLine().split(" ");
        int x = 1, y = 1;

        for (int i = 0; i < plans.length; i++) {
            if (plans[i].equals("R")) {
                if (x < n && x >= 1)
                    x += 1;
            } else if (plans[i].equals("L")) {
                if (x > 1)
                    x -= 1;
            } else if (plans[i].equals("U")) {
                if (y > 1)
                    y -= 1;
            } else if (plans[i].equals("D")) {
                if (y < n)
                    y += 1;
            }
        }

        System.out.println(y + " " + x);

    }
}

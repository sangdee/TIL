import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @when : 2020-03-24 오후 2:44
 * @homepage : https://github.com/sangji11
 */
public class Triagle {
    private int testCase = 10;

    private List<Integer> read() {
        String line = new Scanner(System.in).nextLine();
        String[] strings = line.split(" ");
        List<Integer> integers = new ArrayList<>();

        for (String s : strings) {
            try {
                int i = Integer.parseInt(s);
                integers.add(i);
            } catch (NumberFormatException ignore) {
            }
        }

        return integers;
    }

    private int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    private boolean hasZero(int a, int b, int c) {
        return a == 0 || b == 0 || c == 0;
    }

    private boolean isNotTriangle(int a, int b, int c) {
        int max = max(a, b, c);
        int total = a + b + c;
        return max >= total - max;
    }

    private boolean isEquilateral(int a, int b, int c) {
        return a == b && b == c;
    }

    private boolean isIsosceles(int a, int b, int c) {
        return a == b && b != c;
    }

    private void run() {
        while (testCase-- > 0) {
            List<Integer> list = read();
            if (list.size() != 3) {
                System.out.println("Error : Enter 3 integers values");
                continue;
            }

            int a = list.get(0), b = list.get(1), c = list.get(2);

            if (hasZero(a, b, c))
                System.out.println("Error : All values>0");
            else if (isNotTriangle(a, b, c))
                System.out.println("Error: not a triangle");
            else if (isEquilateral(a, b, c))
                System.out.println("Equilateral");
            else if (isIsosceles(a, b, c) || isIsosceles(b, c, a) || isIsosceles(a, c, b))
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        }
    }

    public static void main(String[] args) {
        new Triagle().run();
    }
}
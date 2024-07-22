package temp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 씨름선수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Person(sc.nextInt(), sc.nextInt()));
        }
        System.out.println(solution(n, list));

    }

    //213 119
    //219 73
    private static int solution(int n, List<Person> list) {
        int result = 0;
        list.sort(Comparator.comparing(Person::getHeight, Comparator.reverseOrder()));

        int max = 0;
        for (int i = 0; i < n; i++) {
            Person target = list.get(i);
            if (target.getWeight() > max) {
                max = target.getWeight();
                result++;
            }
        }
        return result;
    }

    static class Person {
        private int height;
        private int weight;

        public Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        public int getHeight() {
            return height;
        }

        public int getWeight() {
            return weight;
        }
    }
}

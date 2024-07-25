package temp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 나이순정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<User> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new User(i, sc.nextInt(), sc.nextInt()));
        }

        list.sort(Comparator.comparing(User::getAge)
                            .thenComparing(User::getIndex));
        for (User user : list) {
            System.out.println(user.getAge() + " " + user.getName());
        }
    }

}

class User {
    private int index;
    private int age;
    private int name;

    public int getIndex() {
        return index;
    }

    public int getAge() {
        return age;
    }

    public int getName() {
        return name;
    }

    public User(int index, int age, int name) {
        this.index = index;
        this.age = age;
        this.name = name;
    }
}

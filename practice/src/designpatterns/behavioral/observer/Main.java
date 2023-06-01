package designpatterns.behavioral.observer;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
public class Main {
    public static void main(String[] args) {
        Baedi baedi = new Baedi();
        Jay jay = new Jay();
        Tiber tiber = new Tiber();

        baedi.subscribe(jay);
        baedi.subscribe(tiber);

        baedi.eatFood();
    }
}

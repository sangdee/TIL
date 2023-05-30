package designpatterns.adapter;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class Client {
    public static void main(String[] args) {
        Duck turkey = new TurkeyAdapter(new WildTurkey());
        turkey.quack();
    }
}

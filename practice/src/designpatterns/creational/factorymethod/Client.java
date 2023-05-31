package designpatterns.creational.factorymethod;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class Client {
    public static void main(String[] args) {
        UserFactory factory = new NaverUserFactory();
        factory.newInstance();
        UserFactory factory2 = new KakaoUserFactory();
        factory2.newInstance();
    }
}

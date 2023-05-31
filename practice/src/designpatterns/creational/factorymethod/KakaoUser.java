package designpatterns.creational.factorymethod;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class KakaoUser implements User {
    @Override
    public void signUp() {
        System.out.println("카카오 회원가입");
    }
}

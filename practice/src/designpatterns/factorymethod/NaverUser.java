package designpatterns.factorymethod;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class NaverUser implements User {
    @Override
    public void signUp() {
        System.out.println("네이버 회원가입");
    }
}

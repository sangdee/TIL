package designpatterns.creational.factorymethod;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class NaverUserFactory implements UserFactory {
    @Override
    public User createUser() {
        return new NaverUser();
    }
}

package designpatterns.creational.factorymethod;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public interface UserFactory {
    default User newInstance() {
        User user = createUser();
        user.signUp();
        return user;
    }

    User createUser();
}

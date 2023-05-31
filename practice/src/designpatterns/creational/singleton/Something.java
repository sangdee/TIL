package designpatterns.creational.singleton;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/29
 */
public class Something {
    private Something() {
    }

    private static class Holder {
        public static Something INSTANCE = new Something();
    }

    public static Something getInstance() {
        return Holder.INSTANCE;
    }
}

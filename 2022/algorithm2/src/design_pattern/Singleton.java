package design_pattern;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/18
 */
public class Singleton {
    private Singleton() {
    }

    private static class InnerInstanceClazz {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return InnerInstanceClazz.instance;
    }
}

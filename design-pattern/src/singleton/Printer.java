package singleton;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/26
 */
public class Printer {

    private static Printer printer = null;

    private Printer() {
    }

    public static Printer getInstance() {
        if (printer == null) {
            Printer printer = new Printer();
        }
        return printer;
    }

}

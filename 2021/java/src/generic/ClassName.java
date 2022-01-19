package generic;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/08
 */
public class ClassName<T> {

    private T type;

    void setType(T type) {
        this.type = type;
    }

    T getType() {
        return this.type;
    }

    static <E> E genericMethod(E e) {
        return e;
    }

    static <K extends Number> K genericMethod2(K k) {
        return k;
    }

    List<? extends Number> genericMethod3(List<? extends Number> list) {
        return new LinkedList<Integer>();
    }

}

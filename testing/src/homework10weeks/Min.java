package homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author : Sangji Lee
 *
 * @when : 2020-05-18 오후 8:06
 * @homepage : https://github.com/sangji11
 */
public class Min {
    public static <T extends Comparable<? super T>> T min(ArrayList<? extends T> list) {
        //T는 Comparable을 상속하고 Comparable의 비교 타입 ?는 T의 super여야 한다.
        //ArrayList의 타입은 T를 상속받고 있어야한다.
       //T : Person
        if (list.size() == 0) {
            throw new IllegalArgumentException("homework.Min.min");
        }
        Iterator<? extends T> itr = list.iterator();
        T result = itr.next();
        if (result == null) throw new NullPointerException("homework.Min.min");
        while (itr.hasNext()) {
            T comp = itr.next();
            if (comp.compareTo(result) < 0) {
                result = comp;
            }
        }
        return result;
    }
}

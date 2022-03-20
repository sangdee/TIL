package design_pattern.factory;

import java.lang.reflect.InvocationTargetException;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/20
 */
public class FigureFactory {
    public static Figure getFigure(String type, Class<? extends Figure> clazz) {
        try {
            if (type != null) {
                return clazz.getDeclaredConstructor(String.class).newInstance(type);
            }
            return clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException |
            InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Figure getFigure(Class<? extends Figure> clazz) {
        return getFigure(null, clazz);
    }
}

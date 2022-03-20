package design_pattern.factory;

import java.util.Objects;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/20
 */
public class FactoryPattern {
    public static void main(String[] args) {

        Figure circle = FigureFactory.getFigure("circle", Circle.class);
        Objects.requireNonNull(circle).draw();

        // Figure rectangle = FigureFactory.getFigure(Rectangle.class);
        Figure rectangle = new Rectangle();
        rectangle.draw();

        Figure square = FigureFactory.getFigure(Square.class);
        square.draw();
    }
}

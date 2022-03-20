package design_pattern.factory;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/20
 */
interface Figure {
    void draw();

    default void success() {
        System.out.println("success");
    }
}

class Circle implements Figure {
    private String type;

    Circle(String type) {
        this.type = type;
    }
    @Override
    public void draw() {
        System.out.println(type);
    }
}

class Rectangle implements Figure {

    @Override
    public void draw() {
        System.out.println("rectangle");
    }
}

class Square implements Figure {

    @Override
    public void draw() {
        System.out.println("square");
    }
}

package designpatterns.structural.decorator;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class RoadDisplay extends Display {

    @Override
    public void draw() {
        System.out.println("기본 도로 표시");
    }
}

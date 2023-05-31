package designpatterns.structural.decorator;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class CrossingDecorator extends DisplayDecorator {
    public CrossingDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    public void draw() {
        super.draw();
        drawCrossing();
    }

    private void drawCrossing() {
        System.out.println("교차로 표시");
    }
}

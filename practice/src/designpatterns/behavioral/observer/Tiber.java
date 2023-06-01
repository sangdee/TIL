package designpatterns.behavioral.observer;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
public class Tiber implements Crew {
    @Override
    public void update(String msg) {
        System.out.println("타이버가 메세지를 받았습니다." + msg);
    }
}

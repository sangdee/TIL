package design_pattern.observer;

import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/17
 */
public class Main {
    public static void main(String[] args) {
        JPALecture jpaLecture = new JPALecture();
        Observer sangji = new Sangji();
        Observer hyunwoong = new Hyunwoong();

        subscribeLecture(jpaLecture, sangji);
        subscribeLecture(jpaLecture, hyunwoong);
        jpaLecture.notifyObserver();

        unSubscribeLecture(jpaLecture, sangji);
        jpaLecture.notifyObserver();
    }

    public static void subscribeLecture(Observable observable, Observer o) {
        observable.subscribe(o);
    }

    public static void subscribeLecture(Observable observable, List<Observer> o) {
        o.forEach(observable::subscribe);
    }

    public static void unSubscribeLecture(Observable observable, Observer o) {
        observable.unSubscribe(o);
    }

}

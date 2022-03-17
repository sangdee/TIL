package design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/17
 */
public class JPALecture implements Observable {

    List<Observer> observerList = new ArrayList<>();

    private boolean newContentRegistration;

    public boolean isNewContentRegistration() {
        return newContentRegistration;
    }

    public void newContentOpen() {
        System.out.println("신규 컨텐츠 등록");
        newContentRegistration = true;
        notifyObserver();
    }

    @Override
    public void subscribe(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unSubscribe(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        observerList.forEach(Observer::update);
    }

}

package designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
public class Baedi implements Coach {
    private List<Crew> crews = new ArrayList<>();

    public void eatFood() {
        System.out.println("배디가 음식을 먹습니다.");
        notifyCrew("배디가 음식을 먹습니다.");
    }

    public void runaway() {
        System.out.println("배디가 도망갑니다.");
        notifyCrew("배디가 도망갑니다.");
    }

    public void out() {
        System.out.println("배디가 나갑니다.");
        notifyCrew("배디가 나갑니다.");
    }

    @Override
    public void subscribe(Crew crew) {
        crews.add(crew);
    }

    @Override
    public void unsubscribe(Crew crew) {
        crews.remove(crew);
    }

    @Override
    public void notifyCrew(String msg) {
        crews.forEach(crew -> crew.update(msg));
    }
}

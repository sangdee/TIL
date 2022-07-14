package flow_api;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/07/12
 */
public class SubscriberEx implements Subscriber<TempInfo> {

    private Subscription subscription;

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(TempInfo item) {
        System.out.println(item);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("throwable.getMessage() = " + throwable.getMessage() + " [" + Thread.currentThread().getName() + "]");
    }

    @Override
    public void onComplete() {
        System.out.println(" Done ! " + " [" + Thread.currentThread().getName() + "]");
    }
}

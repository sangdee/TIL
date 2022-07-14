package flow_api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/07/12
 */
public class SubscriptionEx implements Subscription {

    private static final ExecutorService executor = Executors.newSingleThreadExecutor();
    private final Subscriber<? super TempInfo> subscriber;
    private final String town;

    public SubscriptionEx(Subscriber<? super TempInfo> subscriber, String town) {
        this.subscriber = subscriber;
        this.town = town;
    }

    @Override
    public void request(long n) {
        executor.submit(() -> {
            for (long i = 0L; i < n; i++) {
                try {
                    subscriber.onNext(TempInfo.fetch(town));
                } catch (Exception e) {
                    subscriber.onError(e);
                    break;
                }
            }
        });
    }

    @Override
    public void cancel() {
        subscriber.onComplete();
    }
}

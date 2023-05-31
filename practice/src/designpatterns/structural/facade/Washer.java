package designpatterns.structural.facade;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
public class Washer {
    private final Wash wash;
    private final Rinse rinse;
    private final SpanDry spanDry;

    public Washer() {
        this.wash = new Wash();
        this.rinse = new Rinse();
        this.spanDry = new SpanDry();
    }

    public void start() {
        wash.wash();
        rinse.rinse();
        spanDry.spanDry();
    }
}

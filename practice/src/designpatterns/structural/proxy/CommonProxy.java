package designpatterns.structural.proxy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class CommonProxy implements BookService, OfferService {
    private final BookService bookService;
    private final OfferService offerService;

    public CommonProxy(BookService bookService) {
        this.bookService = bookService;
        this.offerService = null;
    }

    public CommonProxy(OfferService offerService) {
        this.bookService = null;
        this.offerService = offerService;
    }

    @Override
    public void offer(Offer offer) {
        transaction();
        offerService.offer(offer);
        log();
    }

    @Override
    public void rent(Book book) {
        transaction();
        bookService.rent(book);
        log();
    }

    private void log() {
        System.out.println("로그");
    }

    private void transaction() {
        System.out.println("트랜잭션");
    }
}

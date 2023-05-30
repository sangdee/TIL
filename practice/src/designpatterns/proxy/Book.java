package designpatterns.proxy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class Book {
    private String title;

    public String getTitle() {
        return title;
    }

    public Book(String title) {
        this.title = title;
    }
}

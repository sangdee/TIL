package proxy.virtual;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/26
 */
public class SecretTextFile implements TextFile {

    private String plainText;

    public SecretTextFile(String fileName) {
        this.plainText = SecretFileHolder.decodeByFileName(fileName);
    }

    @Override
    public String fetch() {
        return plainText;
    }
}

class SecretFileHolder {
    public static String decodeByFileName(String name) {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name;
    }
}
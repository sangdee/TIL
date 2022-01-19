package template_method;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/26
 */
class KoreanTeacher extends Teacher {

    @Override
    protected void teach() {
        System.out.println("korean teach");
    }
}

class EnglishTeacher extends Teacher{

    @Override
    protected void teach() {
        System.out.println("eng teach");
    }
}

class MathTeacher extends Teacher{

    @Override
    protected void teach() {
        System.out.println("math teach");
    }
}

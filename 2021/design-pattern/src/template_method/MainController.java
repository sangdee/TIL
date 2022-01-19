package template_method;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/26
 */
public class MainController {

    public static void main(String[] args) {
        Teacher korean = new KoreanTeacher();
        Teacher math = new MathTeacher();
        Teacher eng = new EnglishTeacher();

        korean.startClass();
        math.startClass();
        eng.startClass();
    }

}

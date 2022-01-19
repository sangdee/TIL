package template_method;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/26
 */
abstract class Teacher {

    public void startClass() {
        inside();
        attendance();
        teach();
        outside();
    }

    protected void inside() {
        System.out.println("강의실 입장");
    }

    protected void attendance() {
        System.out.println("출석");
    }

    protected abstract void teach();

    protected void outside() {
        System.out.println("강의실 퇴장");
    }

}

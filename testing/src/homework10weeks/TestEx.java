import homework.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * @author : Sangji Lee
 * @when : 2020-05-18 오후 7:10
 * @homepage : https://github.com/sangji11
 */
public class TestEx {
    private ArrayList<Person> list;
    @Before
    public void set() {

        list = new ArrayList<>();
    }
    @Test
    public void minTest1() {
        Person father = new Father(50);
        Person mother = new Mother(48);
        Person son = new Son(20);
        list.add(father);
        list.add(mother);
        list.add(son);
        System.out.println(Min.min(list));
    }
    @Test
    public void minTest2(){
    list = null;
        System.out.println(list);
    Min.min(list);
    }
    @Test
    public void minTest3(){
        Person father = new Father(null);
        Person mother = new Mother(48);
        list.add(father);
        list.add(mother);
        System.out.println(Min.min(list));
    }
    @Test
    public void minTest4(){
        list.add(null);
        System.out.println(Min.min(list));
    }
    @Test
    public void minTest5(){
        System.out.println(list);
        System.out.println(Min.min(list));
    }
    @Test
    public void minTest6(){
        Person son = new Son(20);
        list.add(son);
        System.out.println(Min.min(list));
    }
    @Test
    public void minTest7(){
        Person father = new Father(50);
        Person mother = new Mother(48);
        list.add(father);
        list.add(mother);
        System.out.println(Min.min(list));
    }
}

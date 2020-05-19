package homework;

/**
 * @author : Sangji Lee
 * @when : 2020-05-19 오후 12:59
 * @homepage : https://github.com/sangji11
 */
public class Person extends Animal implements Comparable<Animal>{
    @Override
    public int compareTo(Animal animal) {
        if(animal.age > this.age){
            return -1;
        }else if(animal.age < this.age){
            return 1;
        }else
            return 0;

    }
}

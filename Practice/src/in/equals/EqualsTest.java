package in.equals;

public class EqualsTest {
    public static void main(String[] args) {

        Person person1 = new Person(40,"Ananya","005");
        Person person2 = new Person(40,"Ananya","005");
        if(person1.equals(person2)){
            System.out.println("equals");
        }else {
            System.out.println("not equals");
        }
        }
}

package Vechicles;

public class Car extends Vechicle {

    @Override
    public void service() {
        System.out.println("car servicing");
        super.service();
    }
}

public class Car {

    int maxSpeed;
    String color;
    float fuels;
    float fuelInLiters;
    int numberOfWheels;



    public void drive(){
        System.out.println("car is driving");
        fuelInLiters--;
    }

    public void speed(){
        System.out.println(maxSpeed);
    }

    public void addFuel(){
        fuelInLiters += fuels;
    }
}

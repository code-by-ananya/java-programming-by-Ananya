public class Car {

    int maxSpeed;
    String color;
    float fuels;
    float fuelInLiters;
    int numberOfWheels;

//    Car(){
//        color = "black";
//        maxSpeed = 180;
//        fuelInLiters = 4;
//    }

    Car(String color){
        this.color = color;
        maxSpeed = 180;
        fuelInLiters = 4;
    }


    public Car start(){
        System.out.println("car is starting");
        return this;
    }

    public void drive(){
        System.out.println("car is driving");
        fuelInLiters--;
    }

    public void speed(){
        System.out.println(maxSpeed);
    }

    public void addFuel( float fuelInLiters){
        this.fuelInLiters += fuelInLiters;
    }
}

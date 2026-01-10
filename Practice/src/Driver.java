public class DriverClass{
    static int minAge = 18;
    int driverAge;



    public boolean isAllowed(){
        return this.driverAge >= minAge;
    }
}



public static void main(String[] args) {

    Car mycar = new Car("Green");
    System.out.println(DriverClass.minAge);
    Car driveCar = mycar.start();
    driveCar.drive();
    mycar.drive();
    System.out.println(mycar.color);
    Car swift = mycar.start();

}


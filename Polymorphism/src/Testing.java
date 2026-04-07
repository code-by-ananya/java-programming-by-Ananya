public class Testing {

    public static void main(String[] args) {

        Car c = new Car();
        Vechicles v = new Vechicles();
        Plane p = new Plane();

        castest(v);
        castest(c);
        castest(p);

        Vechicles vcar = new Car();
//        Car cvechile = (Car) new Vechicles();

        Object ref = new Car();
    }

    private static void castest(Vechicles veh) {

        veh.start();
    }
}

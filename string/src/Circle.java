import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the radius of the circle: ");
        int radius = input.nextInt();
        double area = PI * radius*radius;
        double circumference = 2*PI*radius;
        System.out.println("area is:"+area+" and circumfernce"+circumference);
    }
}

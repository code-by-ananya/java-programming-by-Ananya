import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = input.nextInt();


        String oddOrEven = num % 2 == 0 ? "even" : "odd";
        System.out.println("the given number is " +oddOrEven);
    }
}

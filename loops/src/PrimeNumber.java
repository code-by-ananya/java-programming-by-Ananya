import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("the given number is not prime number");
                return;
            }
        }
        System.out.println("the given number is prime number");
    }
}

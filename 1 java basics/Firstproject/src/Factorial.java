import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the factorial the number:- ");
        System.out.print("enter the number: ");
        int num = input.nextInt();

        int value = factorialNumber(num);
        System.out.println(value);
    }

    public static int factorialNumber(int first){
        int i = 1;
        int fact = 1;
        while (i <= first){
            fact = fact * i;
            i++;

        }
        return fact;
    }
}

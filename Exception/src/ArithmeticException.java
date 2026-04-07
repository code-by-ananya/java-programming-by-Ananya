import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        try {
            int divide = num1/num2;
            System.out.println(divide);
        }catch (java.lang.ArithmeticException exception){
            System.out.println("division by zero");
//            throw exception;
        }
    }
}

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = input.nextInt();
        System.out.print("enter second number: ");
        int num2 = input.nextInt();
        System.out.print("enter the operations: ");
        String opration = input.next();

        int output = switch (opration){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;
        };
        System.out.println("the answer is: " +output);
    }
}

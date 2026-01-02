import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = input.nextInt();
        System.out.println("enter second number:");
        int num2 = input.nextInt();
        int add = sumOfTwoNumber(num1, num2);
        System.out.println("the summation of two number is4" +
                ": " +add);

    }

    public static int sumOfTwoNumber(int first, int second){
        int sum = first + second ;
        return sum ;
    }
}

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the sum of digits of the number:-");
        System.out.print("enter the number: ");
        int num = input.nextInt();

        int value = sumTheDigits(num);
        System.out.println(value);
    }

    public static int sumTheDigits(int first){
        int sum = 0;
        while (first > 0){
            sum = sum + first % 10;
            first = first / 10;
        }
        return sum;
    }
}

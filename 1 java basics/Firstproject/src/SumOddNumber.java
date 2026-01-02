import java.util.Scanner;

public class SumOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the summation of odd number upto specific number:-");
        System.out.print("enter the number: ");
        int num = input.nextInt();

        int summation = addition(num);
        System.out.println(summation);
    }

    public static int addition (int first){
        int i = 1;
        int sum = 0;
        while (i <= first){
            sum = sum + i;
            i += 2;
        }
        return sum;
    }
}

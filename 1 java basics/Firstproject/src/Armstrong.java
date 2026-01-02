import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = input.nextInt();
        ArmstrongNumber(num);
    }


    public static void ArmstrongNumber(int first){
        int sum = 0;
        int copy = first;
        while(copy > 0){
            int digit = copy % 10;
            sum = sum + (digit * digit * digit);
            copy = copy / 10;
        }
        if (sum == first){
            System.out.println("the given number is armstrong number.");
        }else{
            System.out.println("the given number is not armstong number.");
        }
    }
}

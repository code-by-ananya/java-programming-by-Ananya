import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("enter the second number: ");
        int num2 = input.nextInt();
        gcd(num1, num2);

    }


    public static int gcd(int first, int second){
        int min = first > second ? second : first;
        for(int i = min; i > 1; i--){
            if(first % i == 0 && second % i == 0){
                System.out.println("GCD of two number is: "+i);
            }else{
                System.out.println("GCD of two number is: 1");
                break;
            }
        }
        return 0;
    }
}

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the printing of prime number.");
        System.out.print("enter the number: ");
        int num = input.nextInt();

        primeNumber(num);
    }


    public static void primeNumber(int first){
        for(int i = 2; i < first; i++){
            if (first % i == 0){
                System.out.println("number is not prime");
                break;
            }else {
                System.out.println("the number is prime");
                break;
            }
        }
    }
}

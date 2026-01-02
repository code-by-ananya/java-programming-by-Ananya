import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculation of LCM");
        System.out.println("enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("enter the second number: ");
        int num2 = input.nextInt();
        LCMtwoNumber(num1, num2);

    }

    public static int LCMtwoNumber(int first, int second){
        int min = first > second ? first : second;
        int max = first * second;
        for (int i = min; i <= max; i++){
            if(i % first == 0 && i % second == 0){
                System.out.println("LCM of two number is " +i);
            }
        }
        return 0;
    }

}

import java.util.Scanner;

public class GusseingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game");
        int num;
        do {
            System.out.print("enter the correct pass:");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
        }while (num != 123);
        System.out.println("gussed correct");
    }
}

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        System.out.println("welcome to password checker");
        String pass;
        do{
            System.out.print("enter the correct password: ");
            Scanner input  = new Scanner(System.in);
            pass = input.next();
        }while (!pass.equals("mountain"));
        System.out.println("correct password");
    }
}

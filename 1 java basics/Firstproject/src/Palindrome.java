import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the finding of palindrome");
        System.out.print("enter the number: ");
        int num = input.nextInt();
        palindromeNumber(num);
    }

    public static void palindromeNumber(int first){
        int rev  = 0;
        int copy = first;
        while (copy > 0){
            rev = rev * 10 + (copy % 10);
            copy = copy / 10;
        }
        if(rev == first){
            System.out.println("the given number is palindrome");
        }else {
            System.out.println("the given number is not palindrome");
        }
    }
}

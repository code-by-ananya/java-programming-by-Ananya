import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the reversing of the number.");
        System.out.print("enter the number: ");
        int num = input.nextInt();
        reversing(num);
    }


    public static void reversing(int first){
        int rev = 0;
        while (first > 0){
            rev = (rev * 10) +(first % 10);
            first = first / 10;
        }
        System.out.println("number after reverse: " +rev);
    }
}

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = input.nextInt();

        int mod = num < 0 ? -num : num;
        System.out.println("the absolute value is : " +mod);
    }
}

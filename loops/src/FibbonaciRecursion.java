import java.util.Scanner;

public class FibbonaciRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number upto which we print: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int position){
        if (position == 1){
            return 0;
        } if (position == 2) {
            return 1;
        }
        return fibonacci(position-1) + fibonacci(position - 2);
    }
}


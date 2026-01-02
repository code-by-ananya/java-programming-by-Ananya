import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the printing of fibonacci series upto certain number:");
        System.out.println("enter the number: ");
        int num = input.nextInt();
        fibonacciSeries(num);
    }

    public static void fibonacciSeries(int first){
        System.out.println(0);
        if(first > 0){
            System.out.println(1);
        }
        int prev = 0;
        int next = 1;
        int temp;
        while(prev + next <= first){
            temp = prev + next;
            System.out.println(temp);
            prev = next;
            next = temp;
        }
    }
}

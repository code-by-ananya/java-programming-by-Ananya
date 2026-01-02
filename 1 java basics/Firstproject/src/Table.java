import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        System.out.println("Welcome to the printing of table:-");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the the number: ");
        int num = input.nextInt();

        tableOfNumber(num);
    }

    public static void tableOfNumber(int first) {
        for (int i = 1; i <= 10; i++){
            System.out.println(first+ "X" +i+ "=" +first * i);
        }
    }
}

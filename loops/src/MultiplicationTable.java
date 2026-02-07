import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("welcome to the table printing");
        System.out.print("enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num+ "X" +i+ "=" +num*i);
        }
    }
}

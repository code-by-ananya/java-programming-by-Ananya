import java.util.Scanner;

public class ContinueUse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("enter the number: ");
            int num = input.nextInt();
            if(num < 0){
                continue;
            }
            System.out.println(num);
        }
    }
}

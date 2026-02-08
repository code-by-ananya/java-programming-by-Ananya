import java.util.Scanner;

public class GusseingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("guess the correct number: ");
        int num = input.nextInt();
        for (int i = 0; i < 100;i++){
            if(num == 47){
                System.out.println("gussed correct number");
                return;
            }
        }
        System.out.println("guess again");
    }
}

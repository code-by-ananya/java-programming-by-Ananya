import java.util.Scanner;

public class BreakClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("enter the word: ");
            String word = input.next();
            if (word.equals("exit")){
                break;
            }
        }
        System.out.println("exited the loop.");
    }
}

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int row = input.nextInt();

        Righthalfpattern(row);
    }


    public static void Righthalfpattern(int first){
        for (int i = 0; i <= first; i++){
            System.out.print("* ");

            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

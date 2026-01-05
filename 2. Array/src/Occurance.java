import java.util.Scanner;

public class Occurance{
    public static void main(String[] args) {
        System.out.println("welcome to array occurance");
        int [] newArr = ArrayUtility.InputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("now enetr the number you want to check: ");
        int num = input.nextInt();
        int occured = occ (newArr, num);
        System.out.println(occured);
    }

    public static int occ(int [] newArr, int num){
        int counter = 0 ;
        for(int i = 0; i < newArr.length; i++){
            if (newArr[i] == num){
                counter++;
            }
        }
    return counter;
    }

}

import java.util.Scanner;

public class Arraysearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {25, 47, 44, 24, 59, 68, 33, 89, 12, 2};
        System.out.println("enter the number you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(num, arr);
        if(isFound){
            System.out.println("number is found in the array");
        }else{
            System.out.println("number is not found in the array");
        }
    }

    public static boolean isFound(int first, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(first == arr[i]){
                return true;
            }
        }
        return false;
    }
}

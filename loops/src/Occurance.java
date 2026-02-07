import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("enter the elements of array: ");
        int size = input.nextInt();
        int [] num = new  int[size];
        for (int i = 0; i < size; i++){
            System.out.println("enter the element number" +(i+1)+ ":");
            num[i] = input.nextInt();
        }
        System.out.println("now enter the element you want to check");
        int element = input.nextInt();
//        int occur = OccuranceCount(num, element);
//        System.out.println("number of times elements occur is:" +occur);
    }

//    public static int OccuranceCount(int num, int element){
//        int occ = 0;
////        for (int number : num){
////            if (num == element){
////                occ++;
////            }
//        }
//        return occ;
//    }
}

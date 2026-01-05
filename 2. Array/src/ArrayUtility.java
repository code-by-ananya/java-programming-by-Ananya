import java.util.Scanner;

public class ArrayUtility {
    public static int[] InputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of elements: ");
        int size = input.nextInt();
        int [] num = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("enter the element number" +(i + 1) +": ");
            num[i] = input.nextInt();
            i++;

        }
    return num;

    }

    public static void displayArray(int[]numArray){
        int i = 0;
        while (i< numArray.length){
            System.out.println(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }

}

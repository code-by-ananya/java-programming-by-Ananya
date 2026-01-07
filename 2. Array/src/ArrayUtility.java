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


        public static int[][] Input2DArray() {
            Scanner input = new Scanner(System.in);
            System.out.print("enter the number of rows: ");
            int rows = input.nextInt();
            System.out.print("enter the number of columns: ");
            int columns = input.nextInt();
            int[][]num = new int[rows][columns];
            int i = 0;
            while (i < rows) {
                int j = 0;
                while (j < columns){
                    System.out.print("enter the rows" + (i + 1) + "enter columns"+(j+1)+": ");
                    num[i][j]= input.nextInt();
                    j++;
                }
                i++;
            }

            return num;
        }


            public static void displayArray(int[]numArray){
        int i = 0;
        while (i< numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }

}

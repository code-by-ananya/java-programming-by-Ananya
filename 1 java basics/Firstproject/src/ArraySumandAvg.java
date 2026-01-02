import java.util.Scanner;

public class ArraySumandAvg {
    public static void main(String[] args) {
    int[] numArray = ArrayUtility.InputArray();
    int add = sum(numArray);
        System.out.println("summation is :" +add);
    int avgg = average(numArray);
        System.out.println("the average is: " +avgg);

    }

    public static int sum(int[] first){
        int sum = 0;
        int i = 0;
        while (i < first.length){
            sum = sum + first[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] newArray){
        int plus = sum(newArray);
        int avg = plus / newArray.length;
        return avg;
    }

}

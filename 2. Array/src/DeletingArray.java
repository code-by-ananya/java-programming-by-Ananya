import java.util.Scanner;

public class DeletingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to array deletion");
        int [] numArr = ArrayUtility.InputArray();
        System.out.println("now enter the elemet you want to delete: ");
        int num = input.nextInt();
        int [] newArr = delete(numArr, num);
        System.out.println("here is your new array");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] delete(int[] numArr, int num){
        int occurance = Occurance.occ(numArr, num);
        if(occurance == 0){
            return numArr;
        }
        int newsize = numArr.length - occurance;
        int [] newArr = new int[newsize];
        int i  = 0, j = 0 ;
        while (i < numArr.length){
            if(numArr[i] != num){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("welcome to reversing of array" );
        int [] newArr = ArrayUtility.InputArray();
        reverse (newArr);
        System.out.println("your reversed array is :");
        ArrayUtility.displayArray(newArr);
    }

    public static void reverse(int [] arr){
        for(int i = 0;i < arr.length/2; i++){
            int swap = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length - 1) - i] = swap;
        }
    }
}

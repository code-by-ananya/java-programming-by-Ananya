public class MergeTwoArray {
    public static void main(String[] args) {
        int [] arr1 = ArrayUtility.InputArray();
        int [] arr2 = ArrayUtility.InputArray();
        int[] merged = merge(arr1,arr2);
        System.out.println("your merged array is : ");
        ArrayUtility.displayArray(merged);

    }

    public static int[] merge(int[]arr1, int[]arr2){
        int newsize = arr1.length + arr2.length;
        int [] newArr = new int[newsize];
        int i  = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length){
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            }else {
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }
}

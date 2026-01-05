public class SortedArray {
    public static void main(String[] args) {
        int [] newArr = ArrayUtility.InputArray();
        increasing(newArr);
        decreasing(newArr);

    }

    public static void increasing(int [] newArr){
        for (int i = 0; i < newArr.length; i++){
            if(newArr[i] >= newArr[i+1]){
                System.out.println("increasing sorted");
            }
        }
    }


    public static void decreasing(int[] newArr){
        for (int i = 0; i < newArr.length; i++){
            if(newArr[i] <= newArr[i+1]){
                System.out.println("decreasing sorted");
            }
        }
    }
}

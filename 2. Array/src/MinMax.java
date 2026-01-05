public class MinMax {
    public static void main(String[] args) {
        System.out.println("welcome to finding of min and max array :");
        int [] newArr = ArrayUtility.InputArray();
        minandmax(newArr);

    }

public static void minandmax(int [] newArr){
        int max = newArr[0];
        int min = newArr[0];
        for (int i = 0; i < newArr.length; i++){
            if (newArr[0] < newArr[i]) {
                max = newArr[i];
            }
            if(newArr[0] > newArr[i]){
                min = newArr[i];
            }
        }
}
}

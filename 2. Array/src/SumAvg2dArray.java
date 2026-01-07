public class SumAvg2dArray {
    public static void main(String[] args) {
    System.out.println("welcome to the sum and average of 2d array");
    int[][]numArr = ArrayUtility.Input2DArray();
    long sum = sum(numArr);
    double avg = average(numArr);
        System.out.println("your sum of 2d array is : "+sum);
        System.out.println("your average of 2d array is : "+avg);

    }

    public static long sum(int [][] numArr){
        long sum  = 0;
        for (int i = 0; i < numArr.length; i++){
            for (int j = 0; j < numArr[i].length; j++){
                sum = sum + numArr[i][j];
            }
        }
        return sum ;
    }

    public static double average(int [][] numArr){
        if (numArr.length == 0){
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr[0].length;
        double size = rows * cols;
        return sum(numArr) / size ;
    }
}

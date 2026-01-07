public class DiagonalSumOf2dArray {
    public static void main(String[] args) {
        System.out.println("welcome to the diagonal sum");
        int [][]numArr = ArrayUtility.Input2DArray();
        long sum = sumOfDiagonals(numArr);
        System.out.println("sum of diagonal is: "+sum);
    }

    public static long sumOfDiagonals(int[][] numArr){
        long leftSum = sumOfLeftDiagonals(numArr);
        long rightSum = sumOfRightDiagonals(numArr);
        int sum = 0;
        if(numArr.length % 2 != 0){
            int ind = numArr.length / 2;
            sum = sum - numArr[ind][ind];
        }
        return sum ;
    }

    public static long sumOfLeftDiagonals(int[][] numArr){
        long sum = 0;
        for(int i = 0; i <numArr.length; i++){
            sum = sum + numArr[i][i];
        }
        return sum;
    }

    public static long sumOfRightDiagonals(int[][] numArr){
        long sum = 0;
        for (int i = 0; i< numArr.length; i++){
            int cols = numArr.length - i - 1;
            sum = sum + numArr[i][cols];
        }
        return sum;
    }
}

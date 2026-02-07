import javax.swing.text.html.MinimalHTMLWriter;

public class MaximumArray {
    public static void main(String[] args) {

        int [] arr = new int[]{
                2,3,12,5,7,9,10
        };
        int max = Integer.MIN_VALUE;
        for (int num : arr){
//            max  = arr[0];
            if(num > max){
                max = num;

            }
        }
        System.out.println("maximum in the array is: " + max);
    }
}

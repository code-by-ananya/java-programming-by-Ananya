public class Palindrome {
    public static void main(String[] args) {
        int [] numArr = ArrayUtility.InputArray();
        boolean palindrome = isPalindrome(numArr);
        if (palindrome){
            System.out.println("your array is palindrome");
        }else{
            System.out.println("your array is not sorted");
        }
    }

    public static boolean isPalindrome(int [] numArr){
        for (int i = 0; i < numArr.length/2; i++){
            if(numArr[i] != numArr[numArr.length-1-i]){
                return false;
            }
        }
        return  true;
    }
}

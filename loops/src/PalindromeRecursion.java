import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("enter the string you want check: ");
        String str = input.next();
        System.out.println("your string is " +((isPalindrome(str) ? "palindrome" : "not palindrome")));
    }


    public static boolean isPalindrome(String str){
        if (str.length() <= 1){
            return true;
        }
        int lastpos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastpos)){
            return false;
        }
        String newStr = str.substring(1,lastpos);
        return isPalindrome(newStr);
    }
}

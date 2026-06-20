import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("enter your string: ");
        String userString = input.next();
        for (char ch : userString.toCharArray()){
            unique.add(ch);
        }
        System.out.printf("string has %d unique character",unique.size());
    }
}

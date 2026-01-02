import java.util.Scanner;

class Identify{

 public static void main (String[] args){
 
 Scanner input = new Scanner(System.in);
  System.out.print("enter the number: ");
  int num = input.nextInt();
  if(num > 0){
  System.out.println("the number is positive");
  } else if(num < 0){
  System.out.println("the number is negative");
  }else {
  System.out.println("the number is zero");
  }
 }
}
import java.util.Scanner;

class Greatestnumber{

 public static void main (String[] args){
 
 Scanner input = new Scanner(System.in);
  System.out.print("enter the first number: ");
  int num1 = input.nextInt();
  
  System.out.print("enter the second number: ");
  int num2 = input.nextInt();
  
  System.out.print("enter the third number: ");
  int num3 = input.nextInt();
  
  if(num1 > num2 && num1 > num3){
  System.out.println("first number is greatest");
  } else if(num2 > num3){
  System.out.println("second number is greatest");
  }else {
  System.out.println("third number is greatest");
  }
 }
}
import java.util.Scanner;

 class Arthematic{
  
  public static void main(String[] args){
  
   Scanner input = new Scanner(System.in);
   System.out.print("enter first number: ");
   int num1 = input.nextInt();
   
   System.out.print("enter second number: ");
   int num2 = input.nextInt();
   
   System.out.println("summation of two number is: " +(num1 + num2));
   System.out.println("subtraction of two number is: " +(num1 - num2));
   System.out.println("multiplication of two number is : " +(num1 * num2));
   System.out.println("division of two number is : " +(num1/ num2));
   System.out.println("modular division of two number is: " +(num1 % num2)); 
  }
 }
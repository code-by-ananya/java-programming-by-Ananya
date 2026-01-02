import java.util.Scanner;
class Product{
 
 public static void main(String[] args){
 
  Scanner input = new Scanner(System.in);
  
   System.out.print("enter the first number: ");
   float num1 = input.nextFloat();
   
   System.out.print("enter the second number: ");
   float num2 = input.nextFloat();
   
   System.out.println("the product of two floating number is: " +num1 * num2);
 }
}
import java.util.Scanner;

 class Temperature{
  
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  System.out.print("enter the temperature in fahrenheit: ");
  int temp = input.nextInt();
  System.out.print("the temperature in celsius is: " +(temp - 32)*5/9);
  }
 }
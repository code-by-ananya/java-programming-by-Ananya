import java.util.Scanner;

class Area{

 public static void main(String[] args){
 
  Scanner input = new Scanner(System.in);
  
  System.out.print("enter the base of the triangle: ");
  int B = input.nextInt();
  
  System.out.print("enter the height of the trianle: ");
  int H = input.nextInt();
  
  System.out.println("the area of the triangle is: " +(B*H)/2);
 }
 }
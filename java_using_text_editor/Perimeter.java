import java.util.Scanner;
class Perimeter{
 
 public static void main(String[] args){
 
 Scanner input = new Scanner(System.in);
 
 System.out.print(" enter the length of rectangle: ");
 int len = input.nextInt();
 
 System.out.print("enter the breadth of rectangle: ");
 int brea = input.nextInt();
 
 int peri = (len + brea)*2;
 System.out.println("the perimeter of the rectangle is: " +peri);
 }
}
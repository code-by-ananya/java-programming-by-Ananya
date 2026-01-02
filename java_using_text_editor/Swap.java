import java.util.Scanner;

class Swap{

   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("enter first number: ");
   int num1 = input.nextInt();
   System.out.print("enter second number: ");
   int num2 = input.nextInt();
   
   System.out.println("first number before swaping is " +num1);
   System.out.println("second number before swaping is " +num2);
   
   //num1 = num1 + num2;
   //num2 = num1 - num2;
   //num1 = num1 - num2;
   
   int temp;
   temp = num1;
   num1 = num2;
   num2 = temp;
   
   System.out.println("first number after swaping is " +num1);
   System.out.println("second number after swaping is " +num2);

}
}
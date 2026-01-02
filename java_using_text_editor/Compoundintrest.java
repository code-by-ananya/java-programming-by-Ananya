import java.utol.Scanner;

class Compoundintrest{
 
 public static void main(String[] args){
	Scanner input = new Scanner(System.in);
    System.out.print ("enter the principle value: ");
	int p = input.nextInt();
	System.out.print ("enter the rate: ");
	int r = input.nextInt();
	System.out.print ("enter the time: ");
	int t = input.nextInt();
	System.out.println("so compound interest is: " +p*(1+r/100)*t;
 }
}
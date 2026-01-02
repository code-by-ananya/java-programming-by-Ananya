import java.util.Scanner;

class Leapyear{

 public static void main (String[] args){
 
 Scanner input = new Scanner(System.in);
  System.out.print("enter the year: ");
  int year = input.nextInt();
  
  if(year % 4 == 0 && year % 100 != 0 ||( year % 400 == 0)){
  System.out.println("this year is leap year");
  }else{
  System.out.println("this year is not leap year");
  }
 }
}
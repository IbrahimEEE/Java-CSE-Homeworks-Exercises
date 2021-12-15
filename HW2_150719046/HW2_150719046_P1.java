import java.util.Scanner;

public class HW2_150719046_P1 {
	
  public static void main (String[] args) {
	  
	  Scanner input = new Scanner(System.in); // Create a Scanner object as input 
	  
	  System.out.print("Enter the first 9 digits of an ISBN as integer: "); // Take the first 9 digits of ISBN from user as a String object
	  String result = input.nextLine();
	  
	  int ISBN = Integer.parseInt(result); // Type casting from String to integer
	  
      int check_sum = 0; // Create a check_sum and assign initial value as zero 
      
      // Part of calculating last digit of ISBN with given formula
      check_sum += (ISBN%10)*9;
      ISBN/=10;
      check_sum += (ISBN%10)*8;
      ISBN/=10;
      check_sum += (ISBN%10)*7;
      ISBN/=10;
      check_sum += (ISBN%10)*6;
      ISBN/=10;
      check_sum += (ISBN%10)*5;
      ISBN/=10;
      check_sum += (ISBN%10)*4;
      ISBN/=10;
      check_sum += (ISBN%10)*3;
      ISBN/=10;
      check_sum += (ISBN%10)*2;
      ISBN/=10;
      check_sum += (ISBN%10)*1;
      
      if(check_sum%11==10) { //if the mod11(check_sum) equals to 10 last digit of ISBN will be X
      	System.out.print("The ISBN-10 number is "+result+'X');
      }
      
      else {//if the mod11(check_sum) equals to 10 last digit of ISBN will be mod11(check_sum)
      	System.out.print("The ISBN-10 number is "+result+check_sum%11);
      } 	 
 }
}


import java.util.*; //Import java util library to use Scanner class

public class HW1_150719046_P3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Create a new Scanner object as input

		System.out.print("Enter initial pricipal amount: "); //Get amount of initial pricipal from user
		double  initialprincipal = input.nextFloat();

		System.out.print("Enter annual interest rate (e.g. 9.45): "); //Get annual interest rate from user
		double interestrate = input.nextFloat();

		System.out.print("Enter number of time periods in months: "); //Get time periods in months from user
		double timeperiods = input.nextFloat();

		double finalbalance = Math.pow((1+(interestrate/1200)),timeperiods); //Calculate the amount of final balance
		finalbalance *= initialprincipal;

		double totalinterest = finalbalance - initialprincipal; //Calculate the total compound interest 

		System.out.printf("\nInitial principal amount: %.1f \n", initialprincipal); //Display the amount of initial pricipal
		System.out.printf("Monthly interest rate: %.2f \n", interestrate/12); //Display the annual interest rate
		System.out.printf("Total compound interest amount: %.2f \n", totalinterest); //Display the total compound interest
		System.out.printf("Final balance amount: %.2f", finalbalance); //Display the amount of final balance

		
	}

}

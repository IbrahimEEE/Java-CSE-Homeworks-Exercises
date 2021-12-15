import java.util.*; //Import java util library to use Scanner class

public class HW1_150719046_P2 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a new Scanner object as input

        System.out.print("Number of days: "); //Get number of days from user
        int numberofday = input.nextInt();

        int numberofyear = numberofday/365; //Calculate the number of year with divide by 365 (we consider 1 year contains 365 days)

        numberofday = numberofday%365; //Calculate the remain number of day

        int numberofmonth = numberofday/31; //Calculate the number of month with divide by 31 (we consider 1 month contains 31 days)

        numberofday = numberofday%31; //Calculate the remain number of day

        System.out.print("Year: "+ numberofyear+", "+"Month: "+ numberofmonth + ", "+"Day: "+numberofday+"."); //Display the given days in format “Year: <years>, Month: <months>, Day: <days>”
	}

}

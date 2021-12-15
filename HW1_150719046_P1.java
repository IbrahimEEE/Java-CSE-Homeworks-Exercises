import java.util.*; //Import java util library to use Scanner class

public class HW1_150719046_P1 {

	public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in); //Create a new Scanner object as input

        System.out.print("Enter the driving distance: "); //Get driving distance from user 
        float distance = input.nextFloat();

        System.out.print("Enter miles per gallon: "); //Get miles per gallon from user
        float milespergallon = input.nextFloat();

        System.out.print("Enter price per gallon: "); //Get price per gallon from user
        float pricepergallon = input.nextFloat();

        float cost = (distance/milespergallon)*pricepergallon; //Calculate the cost of the trip

        System.out.printf("The cost of driving is $ %.2f", cost); //Display the cost of the trip
     }
}

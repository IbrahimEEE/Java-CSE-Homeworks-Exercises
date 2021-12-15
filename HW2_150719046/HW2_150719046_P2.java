import java.util.Scanner;

public class HW2_150719046_P2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner object as input 
		
		System.out.print("Enter year (e.g. 2012): "); // Get the year value from the user
		int year = input.nextInt();
		
		System.out.print("Enter month (e.g. 1-12): "); // Get the month value from the user
		int month = input.nextInt();
		
		System.out.print("Enter the day of the month (e.g. 1-31): "); // Get the day of the month value from the user
		int dayofmonth = input.nextInt();
		
		// January:1 and February:2 are counted as months 13 and 14 of the previous year.
		if(month==1) { 
			month=13;
			year-=1;
		}
		else if (month==2) {
			month=14;
			year-=1;
		}
		
		// Zeller's formula to calculate the day of the week
	    int today = ((dayofmonth) + ((26*(month+1))/10) + (year%100) + ((year%100)/4) + ((year/100)/4) + ((year/100)*5)) % 7; 
        
	    // Create a switch-case block to achieve relative day calculated from Zeller's formula
        switch(today) {
        case 0:
       	     System.out.print("Day of the week is Saturday");
       	     break;
        case 1:
          	 System.out.print("Day of the week is Sunday");
          	 break;
        case 2:
          	 System.out.print("Day of the week is Monday");
          	 break;
        case 3:
          	 System.out.print("Day of the week is Tuesday");
          	 break;
        case 4:
          	 System.out.print("Day of the week is Wednesday");
          	 break;
        case 5:
          	 System.out.print("Day of the week is Thursday");
          	 break;
        case 6:
          	 System.out.print("Day of the week is Friday");
          	 break;
       }
        
       
	}
}


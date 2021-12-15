import java.util.Scanner;
public class HW2_150719046_P3{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //Create a Scanner object as input 
		
        int year = input.nextInt(); //Create a year variable and take this value from user 
        
        double income = input.nextDouble(); //Create a income variable and take this value from user 
        
        double taxamount = 0; //Create a tax amount variable assign initial value as a zero
        
        double realtaxrate = 0; //Create a real tax rate variable assign initial value as a zero
        
        double diff = 0; //Create a diff variable assign initial value as a zero
        
        // Create a switch-case block to achieve relative year taken from user
        switch(year){
         
        
         case 2017: // Relative formulas in 2017 Under this case 
        	 
        	  // Create a if-else block to achieve relative tax amount calculation formulas 
        	  if(income<13000 && income>0){
        		  taxamount = income*(15.0/100);        		          		  
        	  }
        	  else if(income < 30000){
        		  taxamount = 1950 + (income-13000)*(20.0/100);
        	  }
        	  else if(income < 110000){
        		  taxamount = 5350 + (income-30000)*(27.0/100);		 
        	  }
        	  else{        		          		  
        		  taxamount = 26950 + (income-110000)*(35.0/100);	  
        	  }
        	 break;// End of year 2017 case
        	 
        	 
         case 2018: // Relative formulas in 2018 Under this case 
        	 
        	  // Create a if-else block to achieve relative tax amount calculation formulas
        	  if(income<14800 && income>0){
	       		  taxamount = income*(15.0/100);    		  	       		  
	    	  }
	    	  else if(income < 34000){
	    		  taxamount = 2220 + (income-14800)*(20.0/100);		  
	    	  }
	    	  else if(income < 120000){
	    		  taxamount = 6060 + (income-34000)*(27.0/100);	  
	    	  }
	    	  else{        		         		  
        		  taxamount = 29280 + (income-120000)*(35.0/100); 	  
        	  }
	    	 break; // End of year 2018 case
        	 
	    	 
         case 2019: // Relative formulas in 2019 Under this case 
        	 
        	  // Create a if-else block to achieve relative tax amount calculation formulas
        	  if(income<18000 && income>0){
	       		  taxamount = income*(15.0/100);      		  
	    	  }
	    	  else if(income < 40000){
	    		  taxamount = 2700 + (income-18000)*(20.0/100);	  
	    	  }
	    	  else if(income < 148000){
	    		  taxamount = 7100 + (income-40000)*(27.0/100);	  
	    	  }
	    	  else if(income<500000){
	    		  taxamount = 36260 + (income-148000)*(35.0/100);  
	    	  }
	    	  else{       		  
        	      taxamount = 159460 + (income-500000)*(40.0/100);     
        	  }
	    	 break; // End of year 2019 case
	    	 
	    	 
         case 2020: // Relative formulas in 2020 Under this case 
        	 
        	  // Create a if-else block to achieve relative tax amount calculation formulas
        	  if(income<22000 && income>0){
	       		  taxamount = income*(15.0/100);  		  
	    	  }
	    	  else if(income < 49000){
	    		  taxamount = 3300 + (income-22000)*(20.0/100);	  
	    	  }
	    	  else if(income < 180000){
	    		  taxamount = 8700 + (income-49000)*(27.0/100);  
	    	  }
	    	  else if(income<600000){
	    		  taxamount = 44070 + (income-180000)*(35.0/100);  
	    	  }
	    	  else{		  
       		   	  taxamount = 191070 + (income-600000)*(40.0/100);  	  
        	  }
	    	 break; // End of year 2020 case
	    	 
          default: // if the user prompt a invalid year value then appear error message
        	  System.out.println("Undefined year value");
        	  break;
        }
          // Check again year and income value to continue with calculating and displaying part
          if(year>=2017 && year<=2020 && income>0) { 
        	  diff = income-taxamount; // Calculate the income value after the subtracted tax amount
        	  
    		  realtaxrate = (taxamount/income)*100.0; // Calculate the real tax rate
    		  
    		  //Display part
    		  System.out.println("Income: "+income); 
    		  System.out.printf("Tax Amount: %.2f\n", taxamount);
    		  System.out.printf("Income after tax: %.2f\n", diff);        		  
    		  System.out.printf("Real tax rate: %.2f",realtaxrate);
    		  System.out.print("%");
          }
          // if the user prompt non positive income then appear error message
          else if (income<=0) {
        	  System.out.println("Income must be > 0");       	  
          }
	}
	
}

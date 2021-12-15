import java.util.*;
public class HW3_150719046_P1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); //Create Scanner object to get user choice
		
		do {
			System.out.println("Select one of shapes:\n1. Line \n2. Triangle\n3. Rectangle\n4. Parabola\n5. Circle\n6. Exit ");
			int user_choice = input.nextInt(); // Get user choice
		
			if(user_choice==1) { // if the user_choice equals to 1 activate draw line mode
				draw_line();
				System.out.println();
			}
		
			else if(user_choice==2) { // if the user_choice equals to 2 activate draw triangular mode
				draw_triangular();
				System.out.println();	 
			}
		
			else if(user_choice==3) { // if the user_choice equals to 3 activate draw rectangular mode
				draw_rectangle();
				System.out.println();
			}
		
			else if(user_choice==4) { // if the user_choice equals to 4 activate draw parabola mode
				draw_parabola();
				System.out.println();			 
			}
		
			else if(user_choice==5) { // if the user_choice equals to 5 activate draw circle mode
				draw_circle();
				System.out.println();		 
			}
		
			else if(user_choice == 6) { // if the user_choice equals to 6 exit the system
					break;
			}
		
			else {
				System.out.println("Enter valid choice");
			}
		} while(true);
		
	}
	
	public static void draw_line() {
        /*
         * 
         * Aim of draw_line method is that get a and b 
         * coefficients relative to y = ax+b equation
         * from user and draw a line graph.
         * 
         * draw_line method written by Ibrahim Tınas 
         * 
         */
		System.out.print("Line formula is y = ax + b\nPlease enter the coefficients a and b:");

		Scanner input = new Scanner (System.in); //Create Scanner object to get a and b values from user

		int a = input.nextInt(); // Get coefficient of a  
		int b = input.nextInt(); // Get coefficient of b

		int column,row; // Column corresponds to x Row corresponds to y

		for (column = 10; column > -11; column--) {
			for (row = -10; row <= 11; row++) {

				if ((a * row + b) == column) {
					System.out.print("*"); // if the line equation satisfies, put a "*" sign
				}
				
                // Under this line, if else blocks build blank 21x20 coordinate system
				else if (row == 0) {
					if (column == 10) {
						System.out.print("y");
					}
					else {
						System.out.print("|");
					}
				}

				else if (column == 0) {							
					if (row == 11) {
						System.out.print("x");
					}								 							 						
					else {
						System.out.print("-");
					}
				} 

				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public static void draw_triangular() {
        /*
         * 
         * Aim of draw_triangular method is that 
         * take coordinate of 3 point from user
         * and draw that triangular.
         * 
         * draw_triangular method written by Ibrahim Tınas 
         * 
         */
		
		System.out.print("For triangle, we need the coordinates of the points for three vertices.\nPlease enter the coordinates of 3 vertices a, b, c, d, e, f:");
        
		Scanner input = new Scanner( System.in); //Create Scanner object to get a, b, c, d, e and f values from user

		final float INFINITY = 1 / (float)0; //Create a constant INFINITY value and assign infinity value
		
		int a = input.nextInt(); //Get first point x coordinate
		int b = input.nextInt(); //Get first point y coordinate 
		int c = input.nextInt(); //Get second point x coordinate
		int d = input.nextInt(); //Get second point y coordinate
		int e = input.nextInt(); //Get third point x coordinate
		int f = input.nextInt(); //Get third point y coordinate
        
		int max_x = Math.max(Math.max(a, c), e); // Find max and min x,y values to determine widest interval
        int max_y = Math.max(Math.max(b, d), f);
        int min_x = Math.min(Math.min(a, c), e);
        int min_y = Math.min(Math.min(b, d), f);
        
		double m1,m2,m3; // m1, m2, m3 are slope respectively between (a,b) ; (c,d), between (a,b) and (e,f) ; 
		                 // between (c,d) and (e,f)

		int column,row;  // Column corresponds to x Row corresponds to y

		boolean condition_1,condition_2,condition_3; // These boolean values provide to draw a line when the any slope equals the infinity

		if(c-a==0) {
			m1 = INFINITY; // if the slope between first and second points
			               // is infinity assign that value
			
			condition_1 = true; // When the value of slope infinity, 
			                    // to draw first parts of triangular make condition_1 true
		}
		else {
			m1 = (d-b)/(float)(c-a); // if the slope does not equal to infinity calculate that value 
			m1 = ((int)(m1*10))/10.0;
			
			condition_1 = false; // To ignore infinity situation block make it false
		}

		if(e-a==0) {
			m2 = INFINITY; // if the slope between first and third points
            			   // is infinity assign that value
			
			condition_2 = true; // When the value of slope infinity,
			                    // To draw second parts of triangular make condition_2 true
		}
		else {
			m2 = (f-b)/(float)(e-a); // if the slope does not equal to infinity calculate that value 
			m2 = ((int)(m2*10))/10.0;
			
			condition_2 = false; // To ignore infinity situation block make it false
		}

		if(e-c==0) {
			m3 = INFINITY; // if the slope between second and third points
			               // is infinity assign that value
			
			condition_3 = true; // When the value of slope infinity, 
			                    // To draw third parts of triangular make condition_3 true
		}
		else {
			m3 = (f-d)/(float)(e-c); // if the slope does not equal to infinity calculate that value 
			m3 = ((int)(m3*10))/10.0;
			
			condition_3 = false; // To ignore infinity situation block make it false
		}


		for (column = 10; column > -11; column--) {
			for (row = -10; row <= 11; row++) {
				if (((column-b == Math.round(m1*(row-a))) && (row <= max_x) && (row >= min_x) && (column <= max_y) && (column >= min_y)) || // if the first   
					((column-f == Math.round(m3*(row-e))) && (row <= max_x) && (row >= min_x) && (column <= max_y) && (column >= min_y)) || // or second
					((column-f == Math.round(m2*(row-e))) && (row <= max_x) && (row >= min_x) && (column <= max_y) && (column >= min_y)) || // or third equations satisfies					                                                                        
					((row == a) && (condition_1) && (column<=d) && (column>=b)) || // or if the first slope is infinity
					((row == a) && (condition_2) && (column<=b) && (column>=f)) || // or the second slope is infinity
					((row == e) && (condition_3) && (column<=d) && (column>=f))) { // or the third slope is infinity 
					                                                               // in given intervals put a "*" sign	
					System.out.print("*");								
				}	
				
				// Under this line, if else blocks build a blank 21x20 coordinate system
				else if (row == 0) {
					if (column == 10) {
						System.out.print("y");
					}

					else {
						System.out.print("|");
					}
				}

				else if (column == 0) {							
					if (row == 11) {
						System.out.print("x");
					}	

					else {
						System.out.print("-");
					}
				} 			
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}
	
	public static void draw_rectangle() {
		 /*
         * 
         * Aim of draw_rectangle method is that 
         * take coordinate of 4 point from user
         * and draw that rectangular.
         * 
         * draw_rectangle method written by Ibrahim Tınas 
         * 
         */

		System.out.print("For rectangle, we need the coordinates of the points for three vertices.\nPlease enter the coordinates of 3 vertices a, b, c, d, e, f:");

		Scanner input = new Scanner (System.in);
		
		final float INFINITY = 1 / (float)0; //Create a constant INFINITY value and assign infinity value

		int a = input.nextInt(); //Get first point x coordinate
		int b = input.nextInt(); //Get first point y coordinate 
		int c = input.nextInt(); //Get second point x coordinate
		int d = input.nextInt(); //Get second point y coordinate
		int e = input.nextInt(); //Get third point x coordinate
		int f = input.nextInt(); //Get third point y coordinate

		int g = e+c-a; // Calculate fourth point x coordinate
		int h = f+d-b; // Calculate fourth point y coordinate
		
        int max_x = Math.max(Math.max(a, c), Math.max(e, g)); // Find max and min x,y values to determine widest interval
        int max_y = Math.max(Math.max(b, d), Math.max(f, h));
        int min_x = Math.min(Math.min(a, c), Math.min(e, g));
        int min_y = Math.min(Math.min(b, d), Math.min(f, h));
        
		double m1,m2,m3,m4;
		
        
		int column,row;

		boolean condition_1,condition_2,condition_3,condition_4;

		if(c-a==0) {
			m1 = INFINITY; // if the slope between first and second points
			               // is infinity assign that value
			
			condition_1 = true; // When the value of slope infinity, 
			                    // to draw first parts of triangular make condition_1 true
		}
		else {
			m1 = (d-b)/(float)(c-a); // if the slope does not equal to infinity calculate that value 
			m1 = ((int)(m1*10))/10.0;
			
			condition_1 = false; // To ignore infinity situation block make it false
		}
		
		if(e-a==0) {
			m2 = INFINITY; // if the slope between first and third points
            			   // is infinity assign that value
			
			condition_2 = true; // When the value of slope infinity,
			                    // To draw second parts of triangular make condition_2 true
		}
		else {
			m2 = (f-b)/(float)(e-a); // if the slope does not equal to infinity calculate that value 
			m2 = ((int)(m2*10))/10.0;
			
			condition_2 = false; // To ignore infinity situation block make it false
		}
		
		if(g-e==0) {
			m3 = INFINITY; // if the slope between second and fourth points
			               // is infinity assign that value
			
			condition_3 = true; // When the value of slope infinity, 
			                    // To draw third parts of triangular make condition_3 true
		}
		else {
			m3 = (h-f)/(float)(g-e); // if the slope does not equal to infinity calculate that value 
			m3 = ((int)(m3*10))/10.0;
			
			condition_3 = false; // To ignore infinity situation block make it false
		}
		
		if(g-c==0) {
			m4 = INFINITY; // if the slope between second and fourth points
			               // is infinity assign that value
			
			condition_4 = true; // When the value of slope infinity, 
			                    // To draw third parts of triangular make condition_4 true
		}
		else {
			m4 = (h-d)/(float)(g-c); // if the slope does not equal to infinity calculate that value 
			m4 = ((int)(m4*10))/10.0;
			
			condition_4 = false; // To ignore infinity situation block make it false
		}
		
		boolean is_rectangle = (((int)(m1*m2) == -1) || ((int)(m4*m3) == -1) ||
				                (m1 == INFINITY) || (m2 == INFINITY) || (m3 == INFINITY) || (m4 == INFINITY));
		//-5 2 5 2 -5 -9
		//-2 2 2 6 2 -2
		//-5 3 5 3 -5 -9
		//-5 1 5 1 -10 -9
		//0 6 7 6 -6 0 
		if(is_rectangle) {
			for (column = 10; column > -11; column--) {
				for (row = -10; row <= 11; row++) {
	
					if (((column-b == Math.round(m1*(row-a))) && (row <= max_x) && (row >= min_x) && (column <= max_y) && (column >= min_y)) || // if the first   
						((column-f == Math.round(m3*(row-e))) && (row <= max_x) && (row >= min_x) && (column <= max_y) && (column >= min_y)) || // or second
						((column-f == Math.round(m2*(row-e))) && (row <= max_x) && (row >= min_x) && (column <= max_y) && (column >= min_y)) || // or third equations satisfies
						((column-h == Math.round(m4*(row-g))) && (row <= max_x) && (row >= min_x) && (column <= max_y) && (column >= min_y)) ||
						((row == a) && (condition_1) && (column <= max_y) && (column >= min_y)) || // or if the first slope is infinity
						((row == a) && (condition_2) && (column <= max_y) && (column >= min_y)) || // or the second slope is infinity
						((row == g) && (condition_4) && (column <= max_y) && (column >= min_y)) || // or the fourth slope is infinity
						((row == e) && (condition_3) && (column <= max_y) && (column >= min_y))) { // or the third slope is infinity 
							                                                                       // in given intervals put a "*" sign	
							System.out.print("*");								
					}	
					else if (row == 0) {
						if (column == 10) {
							System.out.print("y");
						}
						else {
							System.out.print("|");
						}
					}
	
					else if (column == 0) {							
						if (row == 11) {
							System.out.print("x");
						}								 							 						
						else {
							System.out.print("-");
						}
					} 
	
					else {
						System.out.print(" ");
					}		
	
				}
				System.out.println("");
			}
		}
		else {
			System.out.println("Please enter a valid rectangle coordinates!");
		}
	}
	public static void draw_parabola() {
		 /*
         * 
         * Aim of draw_parbola method is that get a, b and c 
         * coefficients relative to y = ax^2 + bx + c equation
         * from user and draw a parabola graph.
         * 
         * draw_parabola method written by Ibrahim Tınas 
         * 
         */

		System.out.print("y = ax^2 + bx + c\nPlease enter the coefficients a, b and c:");

		Scanner input = new Scanner (System.in); // Create Scanner object to get a, b and c values from user

		int a = input.nextInt(); // Get coefficient of a 
		int b = input.nextInt(); // Get coefficient of b 
		int c = input.nextInt(); // Get coefficient of c 

		int column,row; // Column corresponds to x Row corresponds to y

		for (column = 10; column > -11; column--) {
			for (row = -10; row <= 11; row++) {

				if (((a * row * row )+ (b*row) +c) == column) { // if the parabola equation satisfies, put a "*" sign
					System.out.print("*");
				}
				// Under this line, if else blocks build a blank 21x20 coordinate system
				else if (row == 0) {
					if (column == 10) {
						System.out.print("y");
					}
					else {
						System.out.print("|");
					}
				}

				else if (column == 0) {							
					if (row == 11) {
						System.out.print("x");
					}								 							 						
					else {
						System.out.print("-");
					}
				} 							
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	public static void draw_circle() {
		 /*
         * 
         * Aim of draw_circle method is that get center (a, b)  
         * coordinates and radius from user and draw a circle graph.
         * 
         * draw_circle method written by Ibrahim Tınas 
         * 
         */
		
		System.out.print("Circle formula is (x-a)^2 + (y-b)^2 = r^2\nPlease enter the coordinates of the center (a,b) and the radius:");
		
		Scanner input = new Scanner (System.in);
		
		int a = input.nextInt(); // Get center of circle x coordinate
		int b = input.nextInt(); // Get center of circle y coordinate
		int r = input.nextInt(); // Get radius of circle
		
		int column,row; // Column corresponds to x Row corresponds to y
		
		for (column = 10; column > -11; column--) {
			for (row = -10; row <= 11; row++) {
					
				if (((row-a)*(row-a))+((column-b)*(column-b)) == r*r) { // if the circle equation satisfies, put a "*" sign
					System.out.print("*");
				}
				// Under this line, if else blocks build a blank 21x20 coordinate system	
				else if (row == 0) {
					if (column == 11) {
					   System.out.print("y");
					}
					else {
					   System.out.print("|");
					}
				}
											
				else if (column == 0) {							
					if (row == 10) {
						System.out.print("x");
					}								 							 						
					else {
					    System.out.print("-");
					}
				} 
							
				else {
					System.out.print(" ");
				}				
			}
				System.out.println("");
		}
	}
	
	
}







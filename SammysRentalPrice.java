/*Name Joseph Parampathu
* Module: Module 2, Case 2
* Description: This program queries the user for the number of minutes rented, and prints Sammy's motto with a border, the cost of the rental, and how long the rental was in hours and minutes
*/
//This imports the Scanner device so that the program can access user input
import java.util.Scanner;
public class SammysRentalPrice
{
	public static void main(String[] arges)
	{
   //This initiates the variables we will use
			int numberOfMinutes;
			int rentalCost;
			int rentalHours;
			int additionalMinutes;
			int RENTAL_HOURLY_RATE = 40;
			int RENTAL_ADDITIONAL_MINUTE = 1;
         //This lets the program know where to find user input
			Scanner input = new Scanner(System.in);
         //This queries the user for how many minutes long the rental was
			System.out.println("How many minutes long was your rental? >> ");
         //This sets the input to the variable numberOfMinutes
			numberOfMinutes = input.nextInt();
         //This translates the minutes into hours and minutes 
			additionalMinutes = numberOfMinutes % 60;
			rentalHours = numberOfMinutes / 60;
         //This calculates the rental cost
			rentalCost = rentalHours * RENTAL_HOURLY_RATE + additionalMinutes * RENTAL_ADDITIONAL_MINUTE;
         //This prints Sammy's motto with border
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
			System.out.println("SSammy's makes it fun in the sun.S");
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      //This prints the number of hours and minutes rented
			System.out.println("Rented for " + rentalHours + " hours and " + additionalMinutes + " minutes.");
         //This prints the total rental cost
			System.out.println("Total rental cost is " + rentalCost);
	}
}

/*Name Joseph Parampathu
* Module: Module 3, Case 2
* Description: This program queries the user for the number of minutes rented, and
prints Sammy's motto with a border, the cost of the rental, and how long the rental
was in hours and minutes using executable methods and the Rental class
*/
//This imports the Scanner device so that the program can access user input
import java.util.Scanner;
public class RentalDemo
{
	//this is the main method
	public static void main(String[] args)
	{
		//Declares a Rental object (an instance of the class Rental in the main method
		Rental firstRental = new Rental();
		int numberOfMinutes = firstRental.getHoursAndMinutes();
		String contractNum = firstRental.getContractNumber();
         //This lets the program know where to find user input
			Scanner input = new Scanner(System.in);

			//This calls the method that prints Sammys Banner
			SammysRentalPriceWithMethods.sammysBanner();
			//This calls the method that passes number of minutes and computes hours, extra minutes, and price
			//and prints the details.
			calculatePrice(firstRental);
	}
	//This is the first method it prompts the user for the rental time in minutes and returns it to the main method
	public static int promptMinutes(){
			int numberOfMinutes;
			//This tells the system where to find information input by the user
	 		Scanner input = new Scanner(System.in);
			//This queries the user for how many minutes long the rental was
	 		System.out.println("How many minutes long was your rental? >> ");
			//This sets the input to the variable numberOfMinutes
			numberOfMinutes = input.nextInt();
			//The program returns the numberOfMinutes
			return numberOfMinutes;
		}
		//This method gets a contract number
		public static String getContractNumber(){
			String contractNum = "XXX";
			return contractNum;
		}
		//This is the second method it prints Carlys Motto with a Banner
		public static void sammysBanner(){
		//This prints Sammy's motto with border
		 System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		 System.out.println("SSammy's makes it fun in the sun.S");
		 System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		}
			public static Rental calculatePrice(Rental contractNum){
				//This initiates the variables we will use
				//The first initialization passes the value for numberOfMinutes to this method
			 int numberOfMinutes = promptMinutes();
			 int rentalCost;
			 int rentalHours;
			 int additionalMinutes;
			 int RENTAL_HOURLY_RATE = 40;
			 int RENTAL_ADDITIONAL_MINUTE = 1;
			 //This translates the minutes into hours and minutes
				additionalMinutes = numberOfMinutes % 60;
				rentalHours = numberOfMinutes / 60;
	   	//This calculates the rental cost
				rentalCost = rentalHours * RENTAL_HOURLY_RATE + additionalMinutes * RENTAL_ADDITIONAL_MINUTE;
	    //This prints the number of hours and minutes rented
				System.out.println("Rented for " + rentalHours + " hours and " + additionalMinutes + " minutes.");
	    //This prints the total rental cost
				System.out.println("Total rental cost is " + rentalCost);
				//This displays the contract number
				System.out.println("Your Contract Number Is: " + contractNum);
				return contractNum;
			}
}

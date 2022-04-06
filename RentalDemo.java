/*Name Joseph Parampathu
* Module: Module 7, Case 2
* Description: This program queries the user for the number of minutes rented, and
prints Sammy's motto with a border, the cost of the rental, and how long the rental
was in hours and minutes using executable methods and the Rental class using constructors
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
		Rental secondRental = new Rental();
		Rental thirdRental = new Rental();
			//This calls the method that prints Sammys Banner
			SammysRentalPriceWithMethods.sammysBanner();
			//This calls the method that passes number of minutes and computes hours, extra minutes, and price
			//and prints the details.
			firstRental.display();
			//This ensures that the number of minutes falls between 60 and 7200 inclusive
			while(firstRental.numberOfMinutes < 60 || firstRental.numberOfMinutes > 7200)
				{
					System.out.println("Your rental must be between 1 and 12 hours long.");
					firstRental.display();
				}
			secondRental.display();
			//This ensures that the number of minutes falls between 60 and 7200 inclusive
			while(secondRental.numberOfMinutes < 60 || secondRental.numberOfMinutes > 7200)
				{
					System.out.println("Your rental must be between 1 and 12 hours long.");
					secondRental.display();
				}
			thirdRental.display();
			//This ensures that the number of minutes falls between 60 and 7200 inclusive
			while(thirdRental.numberOfMinutes < 60 || thirdRental.numberOfMinutes > 7200)
				{
					System.out.println("Your rental must be between 1 and 12 hours long.");
					thirdRental.display();
				}
			//compares two rentals to show which one is longer
			longerRental(firstRental, secondRental);
			longerRental(secondRental, thirdRental);
			longerRental(thirdRental, firstRental);
			//Displays coupon good for 10 percent off next rental as many times as there are full hours
			int i = thirdRental.numberOfMinutes;
			while(i > 0)
			{
				System.out.println("Coupon good for 10% off next rental!");
				i = i - 60;
			}
	}
		//This is the second method it prints Carlys Motto with a Banner
		public static void sammysBanner(){
		//This prints Sammy's motto with border
		 System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		 System.out.println("SSammy's makes it fun in the sun.S");
		 System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		}
		public static Rental longerRental(Rental rentalFirst, Rental rentalSecond)
		{
			if (rentalFirst.numberOfMinutes > rentalSecond.numberOfMinutes)
				System.out.println("The longer rental is " + rentalFirst.numberOfMinutes +
				" minutes long and has a contract number of " + rentalFirst.contractNumber);
			else
				System.out.println("The longer rental is " + rentalSecond.numberOfMinutes +
				" minutes long and has a contract number of " + rentalSecond.contractNumber);
				return rentalFirst;
		}
}

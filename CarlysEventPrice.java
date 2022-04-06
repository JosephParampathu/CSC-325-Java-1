/*Name Joseph Parampathu
* Module: Module 2, Case 1
* Description: This program queries the user for the number of guests, and prints Carly's motto with a border, the cost of the event, and whether the event is large or not
*/
//This imports the Scanner device so that the program can access user input
import java.util.Scanner;
//CarlsyEventPrice program is a public program so it is accessible to outside programs
//The program asks the user how many guests are attending, shows the Carly's motto, and prints the cost of the event
public class CarlysEventPrice
{
	public static void main(String[] arges)
	{
   //These first statements initiate the variables we will be using
			int numberGuests;
			int PRICE_PER_GUEST = 35;
			int totalPrice;
			boolean large;
         //This tells the system where to find information input by the user
			Scanner input = new Scanner(System.in);
         //The program queries the user to input the number of guests
			System.out.print("How many guests are attending? >> ");
         //The program takes the number input and sets it to a variable
			numberGuests = input.nextInt();
         //The program calculates the total price
			totalPrice = numberGuests * PRICE_PER_GUEST;
         //The program determines if this is a "large" event
			large = (numberGuests >= 50);
         //The program prints the Carly's motto bordered by asterisks
      System.out.println("***********************************************");
			System.out.println("*Carly's makes the food that makes it a party.*");
      System.out.println("***********************************************");
      //The program prints the number of guests attending
			System.out.println(numberGuests + " guests attending.");
         //The program prints the price per guest
			System.out.println(PRICE_PER_GUEST + " dollars per guest.");
         //The program prints the total price
			System.out.println(totalPrice + " dollars in total.");
         //The program lets the user know if the event is large or not
			System.out.println("Large Event (50 or more guests)? " + large);
	}
}

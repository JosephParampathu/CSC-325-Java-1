/*Name Joseph Parampathu
* Module: Module 7, Case 2
* Description: This program creates a class rental to hold rental data for Sammy's Rental using constructors
*/
import java.util.Scanner;
//Rental is a public class that can be accessed by other programs

public class Rental{
  //two public static fields that are final constants
  public static final int MINUTES_PER_HOUR = 60;
  public static final int RENTAL_HOURLY_RATE = 40;
  //four private fields for contract number, number of hours rented, number of minutes over an hour, and price
  public String contractNumber;
  public static int rentalHours;
  public int numberOfMinutes;
  public static int additionalMinutes;
  public static int rentalCost;
  //a public method to set the contract number
  public Rental(String contractNum, int numMinutes)
  {
    setContractNumber(contractNum);
    setHoursAndMinutes(numMinutes);
  }
  public Rental()
  {
    contractNumber = "A000";
    numberOfMinutes = 0;
    setContractNumber(contractNumber);
    setHoursAndMinutes(numberOfMinutes);
  }
  //This method displays the information
  public void display()
  {
    //This initiates the variables we will use
    //The first initialization passes the value for numberOfMinutes to this method
   numberOfMinutes = promptMinutes();
   int rentalCost;
   int rentalHours;
   int additionalMinutes;
   int RENTAL_HOURLY_RATE = 40;
   int RENTAL_ADDITIONAL_MINUTE = 1;
  contractNumber = promptContractNumber();
   //This translates the minutes into hours and minutes
    additionalMinutes = numberOfMinutes % 60;
    rentalHours = numberOfMinutes / 60;
    //This calculates the rental cost
     if (additionalMinutes <= 40)
       rentalCost = rentalHours * RENTAL_HOURLY_RATE + additionalMinutes;
     else
       rentalCost = rentalHours * RENTAL_HOURLY_RATE + 40;
  //This prints the number of hours and minutes rented
    System.out.println("Rented for " + rentalHours + " hours and " + additionalMinutes + " minutes.");
  //This prints the total rental cost
    System.out.println("Total rental cost is " + rentalCost);
    //This displays the contract number
    System.out.println("Your Contract Number Is: " + contractNumber);
  }
  public void setContractNumber(String contractNum)
  {
    contractNumber = contractNum;
  }
  //a public method to set the hours and minutes
  public void setHoursAndMinutes(int numMinutes)
  {
    numberOfMinutes = numMinutes;
    int RENTAL_ADDITIONAL_MINUTE = 1;
    //This translates the minutes into hours and minutes
     additionalMinutes = numberOfMinutes % 60;
     rentalHours = numberOfMinutes / 60;
   //This calculates the rental cost
     rentalCost = rentalHours * RENTAL_HOURLY_RATE + additionalMinutes * RENTAL_ADDITIONAL_MINUTE;
  }
  //a public method to get the contract number
  public String getContractNumber()
  {
    return contractNumber;
  }
  //a public method to get the number of minutes
  public int getHoursAndMinutes()
  {
    return numberOfMinutes;
  }
  public int getRentalCost()
  {
    return rentalCost;
  }
  public int getRentalHours()
  {
    return rentalHours;
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
      input.nextLine();
      //The program returns the numberOfMinutes
      return numberOfMinutes;
    }
    //This is the  method it prompts the user for the contract Number and returns it to the main method
    public static String promptContractNumber(){
        String contractNumber;
        //This tells the system where to find information input by the user
        Scanner input = new Scanner(System.in);
        //This queries the user for how many minutes long the rental was
        System.out.println("What is your Contract Number? >> ");
        //This sets the input to the variable numberOfMinutes
        contractNumber = input.nextLine();
        //The program returns the numberOfMinutes
        return contractNumber;
      }
}

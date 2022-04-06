/*Name Joseph Parampathu
* Module: Module 3, Case 1
* Description: This program creates a class rental to hold rental data for Sammy's Rental
*/
//Event is a public class that can be accessed by other programs

public class Rental{
  //two public static fields that are final constants
  public static final int MINUTES_PER_HOUR = 60;
  public static final int RENTAL_HOURLY_RATE = 40;
  //four private fields for contract number, number of hours rented, number of minutes over an hour, and price
  private String contractNumber = "XXX";
  private int rentalHours;
  private int numberOfMinutes;
  private int additionalMinutes;
  private int rentalCost;
  //a public method to set the contract number
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
}

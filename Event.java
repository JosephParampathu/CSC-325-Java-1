/*Name Joseph Parampathu
* Module: Module 3, Case 1
* Description: This program creates a class Event to hold event data for Carly's Catering
*/
//This imports the Scanner device so that the program can access user input
//Event is a public class that can be accessed by other programs

public class Event{
  //two public static fields that are final constants
  public static final int PRICE_PER_GUEST = 35;
  public static final int LARGE_CUTOFF = 50;
  //three private fields for eventNumber, numberGuets, and price
  private String eventNumber = "XXX";
  private int numberGuests;
  private double price;
  //a public method to set the Event number
  public void setEventNumber(String eventNum)
  {
    eventNumber = eventNum;
  }
  //a public method to set the number of guests
  public void setNumberGuests(int numGuests)
  {
    numberGuests = numGuests;
  }
  //a public method to get the event number
  public String getEventNumber()
  {
    return eventNumber;
  }
  //a public method to get the number of numGuests
  public int getNumberGuests()
  {
    return numberGuests;
  }
  //a public method to get the price
  public double getPrice()
  {
    return price;
  }
}

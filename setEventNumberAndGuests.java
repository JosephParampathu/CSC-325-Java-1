/*Name Joseph Parampathu
* Module: Module 4, Case 1
* Description: This program creates a class Event to hold event data for Carly's Catering
and uses overloaded constructors.
*/
//This imports the Scanner device so that the program can access user input
//Event is a public class that can be accessed by other programs

public class setEventNumberAndGuests{
  //two public static fields that are final constants
  public static final int PRICE_PER_GUEST = 35;
  public static final int LARGE_CUTOFF = 50;
  //three private fields for eventNumber, numberGuets, and price
  private String eventNumber = "XXX";
  private int numberGuests;
  private double price;
  //a public constructor that accepts an event number and number of guests as parameters
  public void setEventNumberAndGuests(String eventNm, int nmGuests)
  {
    setEventNumber(eventNm);
    setGuests(nmGuests);
  }
  public void setEventNumberAndGuests()
  {
    eventNumber = "A000";
    numberGuests = 0;
    setEventNumber(eventNumber);
    setGuests(numberGuests);
  }
  //a public method to set the Event number
  public void setEventNumber(String eventNum)
  {
    eventNumber = eventNum;
  }
  //a public method to set the number of guests
  public void setGuests(int numGuests)
  {
    numberGuests = numGuests;
  }
  //a public method to get the event number
  public String getEventNumber()
  {
    return eventNumber;
  }
  //a public method to get the number of numGuests
  public int getGuests()
  {
    return numberGuests;
  }
  //a public method to get the price
  public double getPrice()
  {
    return price;
  }
}

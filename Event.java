/*Name Joseph Parampathu
* Module: Module 6, Case 1
* Description: This program creates a class Event to hold event data for Carly's Catering
and uses overloaded constructors.
*/
//This imports the Scanner device so that the program can access user input
import java.util.Scanner;
//Event is a public class that can be accessed by other programs

public class Event{
  //two public static fields that are final constants
  public static final int LOWER_PRICE_PER_GUEST = 32;
  public static final int HIGHER_PRICE_PER_GUEST = 35;
  public static final int LARGE_CUTOFF = 50;
  public static int PRICE_PER_GUEST;
  //three private fields for eventNumber, numberGuets, and price
  public String eventNumber;
  public int numberGuests;
  private static double price;
  //a public constructor that accepts an event number and number of guests as parameters
  public Event(String eventNm, int nmGuests)
  {
    setEventNumber(eventNm);
    setGuests(nmGuests);
  }
  public Event()
  {
    String eventNumber = "A000";
    int numberGuests = 0;
    setEventNumber(eventNumber);
    setGuests(numberGuests);
  }
  public void promptGuests(){
    //This initiates the variable we will be using
      boolean large;
      double price;
      int PRICE_PER_GUEST;
      int LARGE_CUTOFF = 50;
      int LOWER_PRICE_PER_GUEST = 32;
      int HIGHER_PRICE_PER_GUEST = 35;
      //This tells the system where to find information input by the user
      Scanner input = new Scanner(System.in);
      //The program queries the user to input the number of guests
      System.out.println("How many guests are attending? >> ");
      //The program takes the number input and sets it to a variable
      numberGuests = input.nextInt();
      input.nextLine();
      //After user inputs the number of guests, calculate if it is a large event or not
      if (isLargeEvent() == true)
        PRICE_PER_GUEST = LOWER_PRICE_PER_GUEST;
      else PRICE_PER_GUEST = HIGHER_PRICE_PER_GUEST;
      //The program queries the user to input the number of the Event
      System.out.println("What is the Event Number? >> ");
      //This program takes the String input and sets it to a variable
      eventNumber = input.nextLine();
      //This tells the system where to find information input by the user
      price = numberGuests * PRICE_PER_GUEST;
      //The program determines if this is a "large" event
      large = (numberGuests >= 50);
      //The program prints the number of guests attending
      System.out.println(numberGuests + " guests attending.");
      //The program prints the price per guest
      System.out.println(PRICE_PER_GUEST + " dollars per guest.");
      //The program prints the total price
      System.out.println(price + " dollars in total.");
      //The program lets the user know if the event is large or not
      System.out.println("Large Event (50 or more guests)? " + large);
      //The program displays the event number
      System.out.println("Your Event Number is: " + eventNumber);
    }
  //a public method to set the Event number
  public void setEventNumber(String eventNum)
  {
    eventNum = eventNumber;
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
  //a public method that displays the price per guest
  public int getPricePerGuest()
  {
    return PRICE_PER_GUEST;
  }
  public boolean isLargeEvent()
  {
    if (numberGuests >= 50)
      return true;
    else
      return false;
  }
}

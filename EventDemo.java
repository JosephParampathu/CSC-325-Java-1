/*Name Joseph Parampathu
* Module: Module 7, Case 1
* Description: This program queries the user for the number of guests, and prints
Carly's motto with a border, the cost of the event, and whether the event is large or not using
executable statements and methods. It also prompts the user continuosly using loops.
*/
//This imports the Scanner device so that the program can access user input
import java.util.Scanner;
//EventDemo program is a public program so it is accessible to outside programs
public class EventDemo
{
	public static void main(String[] args)
	{
		//Declares an event object to use default constructors
		//Declares an event object (an instance of the class Event in the main method
		Event firstEvent = new Event();
		Event secondEvent = new Event();
		Event thirdEvent = new Event();
			//Executes carlysBanner Method from the CarlysEventPriceWithMethods
			CarlysEventPriceWithMethods.carlysBanner();
			//Exexutes the method for entering each event's details
			firstEvent.promptGuests();
			//This ensures that the number of guests is between 5 and 100 inclusive
			while(firstEvent.numberGuests < 5 || firstEvent.numberGuests > 100)
				{
					System.out.println("The number of guests must be between 5 and 100 inclusive.");
					firstEvent.promptGuests();
				}
			secondEvent.promptGuests();
			//This ensures that the number of guests is between 5 and 100 inclusive
			while(secondEvent.numberGuests < 5 || secondEvent.numberGuests > 100)
				{
					System.out.println("The number of guests must be between 5 and 100 inclusive.");
					secondEvent.promptGuests();
				}
			thirdEvent.promptGuests();
			//This ensures that the number of guests is between 5 and 100 inclusive
			while(thirdEvent.numberGuests < 5 || thirdEvent.numberGuests > 100)
				{
					System.out.println("The number of guests must be between 5 and 100 inclusive.");
					thirdEvent.promptGuests();
				}
			//compares two events to show which one is larger
			largerEvent(firstEvent, secondEvent);
			largerEvent(secondEvent, thirdEvent);
			largerEvent(thirdEvent, firstEvent);
			//Displays please come to my event for each guest at the third Event
			int i = thirdEvent.numberGuests;
			while(i > 0)
			{
				System.out.println("Please come to my event!");
				i--;
			}
	}
	//a public method to set the Event number
  public static void setEventNumber(String eventNum)
  {
    String eventNumber = eventNum;
  }
  //a public method to set the number of guests
  public static void setGuests(int numGuests)
  {
    int numberGuests = numGuests;
  }
	public static boolean isLargeEvent(int numberGuests)
	{
		if (numberGuests >= 50)
			return true;
		else
			return false;
	}
	public static Event largerEvent(Event eventFirst, Event eventSecond)
	{
		if (eventFirst.numberGuests > eventSecond.numberGuests)
			System.out.println("The larger event has " + eventFirst.numberGuests +
			" guests and an event number of " + eventFirst.eventNumber);
		else
			System.out.println("The larger event has " + eventSecond.numberGuests +
			" guests and an event number of " + eventSecond.eventNumber);
			return eventFirst;
	}
}

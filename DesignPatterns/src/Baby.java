//created by Brandon Carter

//will be storing our observers in an arraylist
import java.util.ArrayList;
public class Baby implements Subject{
	
	private Cry cry;

	public Baby()
	{
		observers = new ArrayList<Observer>();
		System.out.println("A new baby is born");
		System.out.println();
	}
	
	//arraylist of type observer that we call observers
	private ArrayList<Observer> observers;
	
	//registering/adding observer to the list
	public void registerObserver(Observer observer)
	{
		observers.add(observer);
	}
	
	//remove observer from the arraylist
	public void removeObserver(Observer observer)
	{
		observers.remove(observer);
	}
	
	//updates the observers of the crying
	public void notifyObservers()
	{
		for(Observer observer : observers)
		{
			observer.update(cry);
		}
	}
	//our three types of cry
	public void angryCry()
	{
		System.out.println();
		System.out.println("This baby is angry!");
		cry = cry.angryCry;
		notifyObservers();
	}
	public void hungryCry()
	{
		System.out.println();
		System.out.println("This baby is hungry");
		cry = cry.hungryCry;
		notifyObservers();
	}
	public void wetCry()
	{
		System.out.println();
		System.out.println("This baby is wet");
		cry = cry.wetCry;
		notifyObservers();
	}
	
}

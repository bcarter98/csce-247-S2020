//created by Brandon Carter
public class Dad implements Observer {
	private Subject baby;
	//adding dad to observers
	public Dad(Subject baby)
	{
		this.baby = baby;
		baby.registerObserver(this);
	}
	
	//updates baby cry and gives dad response
	public void update(Cry cry)
	{
		switch(cry) {
		case angryCry:
			System.out.println("Dad puts in earplugs");
			break;
			
		case hungryCry:
			System.out.println("Dad feeds baby");
			break;
			
		case wetCry:
			System.out.println("Dad calls mom");
			break;
		
			default: 
				break;
		}
	}

}

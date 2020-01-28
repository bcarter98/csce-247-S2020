//created by Brandon Carter
public class Mom implements Observer{
	private Subject baby;
	//adding mom to the observers
	public Mom(Subject baby)
	{
		this.baby = baby;
		baby.registerObserver(this);
	}
	
	//update the baby cry and gives proper mom response
	public void update(Cry cry)
	{
		switch(cry) {
		case angryCry:
			System.out.println("Mom hugs and rocks baby, maybe spoiling");
			break;
			
		case hungryCry:
			System.out.println("Mom cuddles and feeds baby");
			break;
			
		case wetCry:
			System.out.println("Mom changes baby");
			break;
		
			default: 
				break;
		}
	}
}

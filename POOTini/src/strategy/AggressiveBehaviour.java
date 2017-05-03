package strategy;

public class AggressiveBehaviour implements IBehaviour{
	public int moveCommand()
	{
		System.out.println("\tAgressive Behaviour: if find another robot attack it");
		return 1;
	}
}
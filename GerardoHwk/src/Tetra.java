
public class Tetra  extends Dino{
	private int legs;
	
	Tetra() {
		super();
		legs = 0;
		System.out.println("This is a Tetra!");
	}

	Tetra(String n, int l) 
	{
		super(n);
		legs = 1;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int n) 
	{
		this.legs = n;
	}
}

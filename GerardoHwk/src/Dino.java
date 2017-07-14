
public class Dino {
	
	private String name;
	private int age;
	
	Dino ()
	{
		System.out.println("This is a dino!");
		name = "no name yet";
		age = 21;
	}
	
	Dino(String dname) {
		this();
		System.out.println("This is a dino!");
		name = dname;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}

}

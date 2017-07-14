
public class MainSaurus {

	public static void main(String[] args) {
	//	Dino DinoOne = new Dino("One");
	//	System.out.println(DinoOne.getName());
		
	//	Tetra TetraOne = new Tetra("Bob", 4);
	//	System.out.println(TetraOne.getName());
		
		UltraTetra sample = new UltraTetra();
		sample.getAge();
		
		sample.setThelegs(10);
		
		Dino myDino = (Dino) sample;   //up casting
		System.out.println(((Tetra) myDino).getLegs());
		

	}

}

// $ javac MainSaurus.java
//$ java Mainsaurus


import java.util.Scanner;
public class TempDriver {
	public static void main(String args[]) {
		if(args.length == 0) {
			System.out.println("No command line arguments entered");
			
		} else {
			String arg1 = args[0];
			String arg2 = args[1];
			System.out.println("This is " + arg1 + " and " + arg2);
		}
		
		float val = 0.0f;
	
	
		Temp one = new Temp();
		Temp two = new Temp(val);
		Temp three = new Temp('A');
		
		//pay attention to constructor #4 and getTemp
		Temp four = new Temp(32.0f, 'F');
		
		
		//constructor # 2
		
		
		
		two.setValue(20.5f);
		System.out.print("Value float for Temp two = ");
		System.out.println(two.getValue());
		
		//constructor # 3
		three.setScale('a');
		System.out.print("character for Temp three = ");
		System.out.println(three.getScale());
		
		
		
//		String lastName;
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("Now, Enter lastname: ");
//		lastName = userInput.next();
		
		//have a look at the getTemp and constructor # 4
		System.out.println("Temp in F is: " + four.getTempF());
		System.out.println("Temp in C is: " + four.getTempC());
		
		
		Temp.compare(one, two);
		Temp.compare(two, three);
		
		
		four.compareOne(one);
		two.compareOne(four);
		
	
		
		
	}

}

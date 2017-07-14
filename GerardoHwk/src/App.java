import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int someNumber = 10;
		int otherNumber = 15;
		
		int theSum = someNumber + otherNumber;
		System.out.println(theSum);
		int theSubstraction = someNumber - otherNumber;
		System.out.println(theSubstraction);
		double theMultiplication = (double)someNumber * otherNumber;
		System.out.println(theMultiplication);
		float theDivision = (float)otherNumber * someNumber;
		System.out.println(theDivision);
		
		boolean what = true;
		if (someNumber < otherNumber) {
			System.out.println("It is true");
		}
		else {
			System.out.println("it is false");
		}
		String firstName = "Jaime";
		System.out.println("My First Name is: "+ firstName);
		
		String lastName;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Now, Enter lastname: ");
		lastName = userInput.next();
		System.out.println("Is it " + lastName + "?");
		
	}
}

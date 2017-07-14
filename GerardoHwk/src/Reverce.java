import javax.swing.JOptionPane;

public class Reverce {
	
	private static boolean compareArray() {
		int [] data1 = {10,20,30,40,50};
		int [] data2 = {50,40,30,20,10};
		int countArray = 4;
		
		for(int i = 0; i < data1.length-1; i++) {
			if(data1[i]!=data2[countArray]) {
				System.out.println(data1[i] + " " + data2[countArray]);
				return false;				
			}
			else {
				countArray--;
				System.out.println(data1[i] + " " + data2[countArray]);
			}
		}					
		return true;
	}
	
	private static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		}
		catch (NumberFormatException nfe) {
			return false;
		}
	}
	
	public static void moneyFunctionCalculation(double priceAdd) {
		double price = priceAdd;
		int IVA = 21;
		double total = price + price * IVA/100;
		System.out.println(total);
	}

	public static void main(String[] args) {		
		boolean check = true;
		check = compareArray();
		if(check) {
			System.out.println("same");
		}
		else {
			System.out.println("different");
		}
		
		
		String moneyCalculation = JOptionPane.showInputDialog("Enter Price");
		while(!isNumeric(moneyCalculation)) {
			moneyCalculation = JOptionPane.showInputDialog("enter just two digits");
		}
		if(isNumeric(moneyCalculation)) {
			double newCalculation = Double.parseDouble(moneyCalculation);
			moneyFunctionCalculation(newCalculation);
		}
	}
}

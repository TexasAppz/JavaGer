
public class Pencil {

	public String color = "red";
	public int length = 2;
	public float diameter;
	public static long nextID = 8;
	private float price;

	public void setPrice(float newPrice, int x) {
		price = newPrice;
		length = x;
	}

	public float getPrice() {
		return price;
	}

	public static void main(String[] args) {
		System.out.println(nextID);

	}

}

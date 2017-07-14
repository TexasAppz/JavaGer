
public class CreatePencil {
	
	
	public static void main (String args[]) {
		Pencil p1 = new Pencil();
		Pencil p2 = new Pencil();
		Pencil p3 = new Pencil();
		
		p1.length = 5;
		p1.length = 6;
//		System.out.println(p1.length);

		
		p2.color ="yellow";	
		p2.color ="green";
//		System.out.println(p2.color);

		
		p3.setPrice(0.5f, 9);
		
	
		System.out.println(p3.getPrice());
	


		


	
	}

}

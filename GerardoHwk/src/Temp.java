
public class Temp {

	private float value;
	private char scale;

	//constructor # 1
	Temp() {
		value = 0;
		scale = 'U';
	
	}
	//constructor #2
	Temp(float decimal) {
		this();
		value = decimal;
	}
	//constructor #3
	Temp(char unit) {
		this();
		scale = unit;
	}
	
	//constructor #4
	Temp(float decimal, char unit) {
		value = decimal;
		scale = unit;
	}
	
	
	//coming from constructor # 2
	public void setValue(float decimal) {	
		value = decimal;
	}
	public float getValue() {
		return value;	
	}
	
	//coming from constructor # 3
	public void setScale(char unit) {	
		scale = unit;
	}
	public char getScale() {
		return scale;	
	}
	
	//coming from constructor # 4
	public float getTempF(){
		if(scale =='C') {
			return 9/5.0f*(value+32); }
		else if (scale == 'F') {
			return value; }
		return 0;
	}
	//coming from constructor # 4
	public float getTempC(){
		if(scale == 'F') {
			return 5/9.0f*(value-32); }
		else if (scale == 'C') {
			return value; }
		return 0;
	}
	//class method
	public static int compare(Temp A, Temp B) {
		if (A.getScale() == 'C' && B.getScale() == 'C') {
			System.out.println("They are both C");
			if (A.getValue() == B.getValue()) {
				System.out.println("0 - two temps are equal");
			}
			else if (A.getValue() > B.getValue()) {
				System.out.println(("1 - first temp is higher than second"));
			}
			else if (A.getValue() < B.getValue()) {
				System.out.println("1 - first temp is lower than second");
			}
		}
		if (A.getScale() == 'F' && B.getScale() == 'F') {
			System.out.println("They are both C");
			if (A.getValue() == B.getValue()) {
				System.out.println("0 - two temps are equal");
			}
			else if (A.getValue() > B.getValue()) {
				System.out.println(("1 - first temp is higher than second"));
			}
			else if (A.getValue() < B.getValue()) {
				System.out.println("1 - first temp is lower than second");
			}
		}
		return 0;
	}
	//instance method
	public int compareOne(Temp A) {
		//option one
		//System.out.println(this.value);
		//option two
		//System.out.println(A.value);
		return 0;
	}
	

}

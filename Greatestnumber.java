package Java;

public class Greatest_Number {
	public static void main(String args[]) {
		int a = 25;
		int b = 12;
		int c = 61;
		
		if((a>b)&&(a>c)) {
			System.out.println(a+ " is greatest.");
		}
		else if((b>c)&&(b>a)) {
			System.out.println(b+ " is greatest.");
		}
		else {
			System.out.println(c+ " is greatest.");
		}
	}
}

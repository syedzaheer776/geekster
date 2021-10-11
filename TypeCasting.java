package Java;

public class TypeCasting {

	public static void main(String[] args) {
		
		short old_age = 24;
		int new_age = old_age;
		System.out.println(new_age);
		
		int salary = 15524;
		double new_salary = salary;
		System.out.println(new_salary);
		
		int cash = 24300;
		short new_cash = (short) cash;
		System.out.println(new_cash);
		
		long money = 2000000;
		short new_money = (short) money;
		System.out.println(new_money); 
		
		float num = 20.95f;
		int my_num = (int) num;
		System.out.println(my_num); 

	}

}

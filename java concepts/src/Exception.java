
 class Exception {
	void display()
	{
		try
		{
			int a=5/0;
			int b[]=new int [5];
			b[6]=3;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Exception Handled");
	}
}
 class Except
 {
	 public static void main(String args[])
	 {
		 Exception obj = new Exception();
		 obj.display();
	 }
 }

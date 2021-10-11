package Java;
import java.util.Scanner;
public class Prime_number {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		int num = sc.nextInt();
		
		System.out.println("Prime Number between 0 to "+num+" are:");
		
		for(int i=2;i<num;i++)
		{
			int a=i/2;
			int b=0;
			for(int j=2;j<=a;j++)
			{
				if(i%j==0)
				{
					b=b+1;
				}
			}	
			if(b==0)
			{
				System.out.println(i);
			}
		}
	}
}

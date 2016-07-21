import java.util.*;
public class Primeno {
	public static void main(String[] args) {
		int a;
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value:");
		a=s.nextInt();
		for(int i=2;i<=a/2;i++)
		{ 
			
			if(a%i==0)
			{
				count=1;
			}
		
		}
		if(count==0)
		{
			System.out.println(a+"prime");
		}
		else
		{
			System.out.println(a+"not prime");
		}s.close();
	}

}

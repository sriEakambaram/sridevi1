import java.util.*;
public class Fact {
	public int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}else
		{
			return n*fact(n-1);
			
		
	}
		}
public static void main(String[] args) 
{
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter the values:");
	int d;
	int n=s.nextInt();
	han4 h=new han4();
	d=h.fact(n);
	System.out.println(d);
	s.close();
	

}}

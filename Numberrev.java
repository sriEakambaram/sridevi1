public class Numberreverse {
public static void main(String[] args) {
	int a[]=new int [3];
	Scanner s=new Scanner(System.in);
	System.out.println("enter the numbers:");
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		s.close();

	}

}

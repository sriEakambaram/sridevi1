import java.util.Scanner;
public class Posorneg {
public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number:");
	n=s.nextInt();
	if(n>0)
	{
		System.out.println("positive");
	}
	else 
	{
		System.out.println("negative");
	}
	
		s.close();

	}

}

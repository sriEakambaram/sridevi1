package assign;
import java.util.*;
public class Vowel {
public static void main(String[] args) {
	char c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character");
		c=s.next().charAt(0);
		if(c=='a' ||c=='e'|| c=='i' || c=='o'||c=='u')
		{	
		System.out.println(" vowel");
		}
		else
		{
			System.out.println("consonant");
		}
		s.close();
	}

}

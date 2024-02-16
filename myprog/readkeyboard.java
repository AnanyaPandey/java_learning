import java.util.*;
class keyboardread
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		// s is the object of scanner
		int a,b,c;
		System.out.print("Enter Two Numbers");
		a = s.nextInt();
		//nextint is for accepting the integer
		b = s.nextInt();
		c = a + b;
		String name;
		System.out.println("What is your name");
		name = s.nextLine();
		System.out.println("Sum is " +c);
		System.out.println("Name is "+name);
	}
	
}



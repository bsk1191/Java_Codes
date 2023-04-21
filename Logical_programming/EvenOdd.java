import java.util.*;
class Even_Odd {
	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number=scn.nextInt();
		String res= number%2==0? " is Even" : " is Odd";
		System.out.println(number+res);
		}
	
}

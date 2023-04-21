import java.util.*;
class GreatestOfTwoNumbers{
	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number1=scn.nextInt();
		System.out.print("Enter any number: ");
		int number2=scn.nextInt();
		String result= number1>number2? number1+ " is greater" : number2+ " is greater";
		System.out.println(result);
	}
	
}

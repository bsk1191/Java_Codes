import java.util.*;
class GreatestOfThreeNumbers{
	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number1=scn.nextInt();
		System.out.print("Enter any number: ");
		int number2=scn.nextInt();
		System.out.print("Enter any number: ");
		int number3=scn.nextInt();
		int temp= number1>number2? number1:number2;
		int result=temp>number3?temp:number3;
		System.out.println(result+" is greatest");
	}
	
}

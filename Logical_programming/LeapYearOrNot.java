import java.util.*;
class LeapYearOrNot{
	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter any year: ");
		int year=scn.nextInt();
		if(year % 400 ==0 || (year % 4 ==0 && year % 100 !=0))
			System.out.println(year+" is leap year");
		else
			System.out.println(year+" is not leap year");
	}
	
}

import java.util.*;
class NumberOfDaysInAMonth {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the month: ");
		int month=scn.nextInt();
		System.out.print("Enter the Year: ");
		int year=scn.nextInt();
		if(month>0 && month<=12)
			if (month==2&&(year%400==0)|| (year%100!=0 && year%4==0))
				System.out.println("The Month is having 29 days");
			else if(month==2)
				System.out.println("The Month is having 28 days");
			else if(month==2 || month==4 ||month==6 || month==9 || month==11)
				System.out.println("The Month is having 30 days");
			else 
				System.out.println("The Monthis having 31 days");
		else
				System.out.println("Invalid Month");

	}
}

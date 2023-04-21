import java.util.*;
class SumOfNumbers {
	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number=scn.nextInt();
		int sum=0;
		for (int i=1;i<=number ;i++ ){
			sum+=i;
		}
		System.out.println("The sum is: "+sum);
	}
	
}

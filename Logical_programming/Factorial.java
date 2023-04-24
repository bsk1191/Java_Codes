import java.util.*;
class Factorial{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the range: ");
		int range=scn.nextInt();

		long fact=1; 

		for (int i=1;i<=range ;i++ )
			fact*=i;

		System.out.println(fact);
	
	}
}

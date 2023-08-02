import java.util.*;
class TrailingZeros{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=scn.nextInt();
		System.out.println(zeros(n));
	}
	static int zeros(int n){
		int res=0;
		int powerOf5=5;         //  n/5+n/25+n/625
		while(n>=powerOf5){
			res=res+(n/powerOf5);
			powerOf5=powerOf5*5;
		}
		return res;

	}
}

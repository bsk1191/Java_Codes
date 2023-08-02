import java.util.*;
class Counter{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=scn.nextInt();
		System.out.println(counter(n));
	}
	static int counter(int n){
		int count=0;
		while(n>0){
			n=n/10;
			count++;
		}
			return count;
	}
}

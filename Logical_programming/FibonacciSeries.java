
//A series of numbers in which each number is the sum of the two preceding numbers.
import java.util.*;
class FibonacciSeries{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the range upto you want fib series: ");
		int range=scn.nextInt();
		int prev=0;
		int next=1;
		int res=0;
		for (int i=0;i<=range;i++ ){
			System.out.print(prev+" ");
			res=prev+next;					
			prev=next;
			next=res;
		}
	}
}

import java.util.*;
class SumOfDigitsOfNum {
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num=scn.nextInt();
		int sum=0;
		while(num>0){
			sum+=num%10;
			num=num/10;

		}
		System.out.println("The sum of the digits are: "+sum);
	}
}

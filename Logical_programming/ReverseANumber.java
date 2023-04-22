import java.util.*;
class ReverseANumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num=scn.nextInt();
		int rev=0;
		while(num!=0){
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("After reversing the number is: "+rev);

	}
}

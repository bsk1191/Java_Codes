import java.util.*;
class ReverseANumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num=scn.nextInt();
		int rev=0;
		while(num!=0){ 			//iterating until the condition becomes false(i.e until number becomes 0).
			rev=rev*10+num%10;	//Extracting the last digit and adding to rev variable
			num=num/10;		//Elemenating the last digit from the number.
		}
		System.out.println("After reversing the number is: "+rev);

	}
}

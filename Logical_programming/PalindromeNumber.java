import java.util.*;
class PalindromeNumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num=scn.nextInt();
		int rev=0;
		int orgNum=num;									//take a temp variable and store orignal value in it.
		while(num!=0){								   // reverse the given number and store it in rev variable.
			rev=rev*10+num%10;							
			num=num/10;
		}
		if (orgNum==rev)										//compare the rev and temp variable if both are same then it is palindrome
			System.out.println(orgNum+" is palindrome");
		else
			System.out.println(orgNum+" is not palindrome");

	}
}

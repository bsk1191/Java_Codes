import java.util.*;
class PalindromeString {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter A String: ");
		String str=scn.nextLine();
		String rev="";
		String orgStr=str;	
		int len=str.length();
		for (int i=len-1;i>=0 ;i-- ){
			rev+=str.charAt(i);
		}
		if (orgStr.equals(rev))
			System.out.println(orgStr+" is palindrome ");
		else
			System.out.println(orgStr+" is not palindrome ");
	}
}

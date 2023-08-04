import java.util.*;
class BinaryToDecimal{
	static String binaryToDecimal(int n){
		String res="";
		while(n>=1){
			int rem=n%2;
			n=n/2;
			res=rem+res;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number to convert into binary form: ");
		int n=scn.nextInt();
		System.out.println(binaryToDecimal(n));
	}
}

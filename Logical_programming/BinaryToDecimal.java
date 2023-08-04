import java.util.*;
class BinaryToDecimal{
	static int binaryToDecimal(String s){
		int res=0;
		int powerOf2=1;
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)=='1')
				res=res+powerOf2;
			powerOf2=powerOf2*2;
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

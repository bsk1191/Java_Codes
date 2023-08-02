import java.util.*;
class HCF {
	static int hcf(int a, int b){
		int min=0;
		if(a<b)
			min=a;
		else
			min=b;
		for(int i=min;i>=1;i--)
			if(a%i==0 && b%i==0)
				return i;
		
		return 1;
	}
	static int euclideHcf(int a,int b){
		while(a!=0 && b!=0){
			if(a>b)
				a=a%b;
			else
				b=b%a;
		}
		if(a!=0)
			return a;
		else
			return b;
	}
	static int euclideHcfEx(int a,int b){
		while(a!=b){
			if(a>b)
				a=a%b;
			else
				b=b-a;
		}
		return a;
	}
	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=scn.nextInt();
		System.out.print("Enter second number: ");
		int b=scn.nextInt();
		//System.out.println(hcf(a,b));
		System.out.println(euclideHcfEx(a,b));
	}
}

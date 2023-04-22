import java.util.*;
class SwappingOfTwoNum{
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1=scn.nextInt();
		System.out.print("Enter Second Number: ");
		int num2=scn.nextInt();
		num1+=num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping the num1 is: "+num1+"\nAfter Swapping the num2 is: "+num2);
	}
}

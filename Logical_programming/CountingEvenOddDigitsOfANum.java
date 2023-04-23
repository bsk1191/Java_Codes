import java.util.*;
class  CountingEvenOddDigitsOfANum{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num=scn.nextInt();
		int oddCount=0;
		int evenCount=0;
		while(num>0){
			int rem=num%10;				//Extract the last digit
			if (rem%2==0)				//check for even or odd
				evenCount++;			//if even increase even count
			else
				oddCount++;				//if odd increase odd count

			num=num/10;					//elemenate the last digit
		}
		System.out.println("Even count is: "+evenCount);
		System.out.println("Odd count is: "+oddCount);
}
}

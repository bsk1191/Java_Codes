import java.util.*;
class EvenOrOddOfAnArray {
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the size of the Array: ");
		int size=scn.nextInt();
		int array[]=new int[size];
		int sum=0;
		System.out.println("Enter the elements of the Array: ");
		for (int i=0;i<size ;i++ ){
			array[i]=scn.nextInt();
		}
		System.out.print("Even elements are: ");
		for (int value:array)									    //this loop retrives the first element from array variable
			if (value%2==0)
				System.out.print(value+" ");					//and stores in value variable next retrieves until the size-1
		System.out.println();
		System.out.print("Odd elements are: ");
		for (int value:array)
			if (value%2!=0)
				System.out.print(value+" ");
		System.out.println();

	}
}

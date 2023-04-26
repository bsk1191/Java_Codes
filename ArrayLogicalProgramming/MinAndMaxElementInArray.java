import java.util.*;
class MinAndMaxElementInArray{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");

		int size=scn.nextInt();
		int array[]=new int[size];

		System.out.println("Enter the elements: ");

		for (int i=0;i<array.length;i++)
			array[i]=scn.nextInt();

		int max=array[0];							// Assume the first element as max element.

		for (int i=1;i<array.length;i++ )			// Retrieve the remaining elements.
			if (array[i]>max)						// Compare the remaing elements with max variable if true.
				max=array[i];						// Assign that element to the max variable.
			
		
		System.out.println("The max element value is: "+max);
	}
}

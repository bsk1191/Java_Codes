import java.util.*;
class LinearSearch{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=scn.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i=0;i<size ;i++ )
			array[i]=scn.nextInt();

		System.out.print("Enter the elements to find out from the array: ");
		int ele=scn.nextInt();
		boolean found=false;
		for (int i=0;i<array.length ;i++ )
			if (ele==array[i]){                             // Compare the given element with all the elements in the array
				System.out.println("Element is found");
				found=true;
				break;
		}
		if(found==false)
			System.out.println("Element is not found");


	}
}

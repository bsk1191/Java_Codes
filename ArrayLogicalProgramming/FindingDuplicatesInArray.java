import java.util.*;
class FindingDuplicatesInArray{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=scn.nextInt();
		int array[]=new int[size];

		System.out.println("Enter the elements of the array: ");
		for (int i=0;i<array.length ;i++ )
			array[i]=scn.nextInt();

		boolean found=false;										// Assume that there is no duplicate element

		for (int i=0;i<array.length ;i++ )								// Take first element from the array.
			for (int j=i+1;j<array.length ;j++ )							// Compare the first element with remaining values
				if (array[i]==array[j]){
					System.out.println("The Duplicate Element is found: "+array[j]);
					found=true;
					break;
		}
		if (found==false)
			System.out.println("Duplicate Element is NOT found");
		
	}
}

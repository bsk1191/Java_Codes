import java.util.*;
class EqualityOfArray{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the size of the first array: ");

		int size1=scn.nextInt();
		int array1[]=new int[size1];
		System.out.println("Enter the elements for first array: ");
		for (int i=0;i<size1 ;i++ )
			array1[i]=scn.nextInt();

		System.out.print("Enter the size of the second array: ");
		int size2=scn.nextInt();
		int array2[]=new int[size2];
		System.out.println("Enter the elements for second array: ");
		for (int i=0;i<size2 ;i++ ){
			array2[i]=scn.nextInt();
		}

		boolean status=true;									//Take a boolean variable and assign default value true.

		if (array1.length==array2.length){						//first check the size of both the arrays if size of both arrays are equal.
			for (int i=0;i<array1.length ;i++ ){				//then the control enters into the loop else control enters into else block.
				if (array1[i]!=array2[i])						// If the size if matched then retrive the elements of one array and compare with the other array elements.
					status=false;								// If the elements are not equal change the default value to false.
			}
		}else
			status=false;

		if (status==true)										//If the boolean value is still true then the arrays are equal
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are NOT equal");
		
	}
}

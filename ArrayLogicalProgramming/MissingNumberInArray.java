import java.util.*;
class MissingNumberInArray{
	public static void main(String[] args) {
		/*Rules
			1.Array should not have duplicates.
			2.Array should be in a proper range.
			3.Array no need to be in sorted order.
		*/
		int array[]={1,2,4,5,6};
		int sum1=0;
		int sum2=0;
		for (int i=0;i<array.length ;i++ )
			sum1+=array[i];
		for (int i=1;i<=6 ;i++ )
			sum2+=i;
		System.out.println("Sum of the given array is: "+sum1);
		System.out.println("Sum of the numbers in given range is: "+sum2);
		System.out.println("The missing number in the array is: "+(sum2-sum1));
	}
}
		

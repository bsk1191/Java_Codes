class ReversingTheElementsOfArray{
	public static void main(String[] args) {
		int array[]={1,2,3,4,5,6};
		int low=0;													// Swap first element with last element in the array.
		int high=array.length-1;									// Next swap the second element with 2nd ele from the last of the array.
		while(high>low){											// Continue swapping until the high values if greater than low.
			int temp=array[low];									// Take temp variable and assign it with zero index values of array(low var value).							
			array[low]=array[high];									// Assign the high value to low.
			array[high]=temp;										// Assing temp value to high.
			low++;													// Increase the value of low.
			high--;													// Decrease the value of high.
		}
		System.out.println(java.util.Arrays.toString(array));
	}
}

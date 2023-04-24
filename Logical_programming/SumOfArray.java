import java.util.*;
class SumOfArray {
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
		for (int i=0;i<array.length ;i++ ){
			sum+=array[i];
		}
		System.out.println(sum);

	}
}

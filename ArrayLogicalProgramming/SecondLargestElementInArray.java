import java.util.*;
class  SecondLargestElementInArray{
	public static void main(String[] args) {
		int[] array={10,11,9,5,8,2,4,3,0};
		int temp=0;
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]<array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		
		}
		System.out.println(array[1]);
		
	}
	
}

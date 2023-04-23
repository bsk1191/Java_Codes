import java.util.*;
class  CountingDigits{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num=scn.nextInt();
		int count=0;
		while(num!=0){
			num=num/10;    //remove last digit and increase count variable
			count++;
		}
		System.out.println(count);
		
}
}

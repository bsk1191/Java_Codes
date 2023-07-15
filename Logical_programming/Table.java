import java.util.*;
class Table {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("enter the table you want: ");
		int num=scn.nextInt();
		for(int i=0;i<10;i++)
			System.out.println(num+" * "+(i+1)+ " "+"="+num*(i+1));
	}
}

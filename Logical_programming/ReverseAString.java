import java.util.*;
class ReverseAString {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter A String: ");    //Take a string as input from the user.
		String Original=scn.nextLine();		  
		String rev="";						             //Take an empty variable to store the reslut.
		int len=Original.length();			       //find the length of the given string.
		for (int i=len-1;i>=0 ;i-- ){		      //Iterate through the length of the string and decrease length for next iteration.
			rev=rev+Original.charAt(i);		     //charAt() method extracts the letter at the given i index position and adds to 
											                  //the rev variable.
		}
		System.out.println("After reversing the string is: "+rev);
	}
}

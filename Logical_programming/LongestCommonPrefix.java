import java.util.Arrays;
class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs){
		StringBuilder result=new StringBuilder(); // to store the results
		Arrays.sort(strs);                     //Sort the given array
		char[] first=strs[0].toCharArray();    //find first nd last element in the array and convert them to char[] to compare the chars
		char[] last=strs[strs.length-1].toCharArray();
		for(int i=0;i<first.length;i++){   
			if(first[i]!=last[i])
				break;
			result.append(first[i]);
		}
		return result.toString();
	}
}
public class Testlcp{
	public static void main(String[] args){
		String[] s={"sai","sat","sahith"};
		System.out.println(LongestCommonPrefix.longestCommonPrefix(s));
	}
}

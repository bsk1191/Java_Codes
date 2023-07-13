import java.io.*;
import java.util.*;
class Fis{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner scn=new Scanner(System.in);
		System.out.print("enter source file: ");
		String src=scn.nextLine();
		System.out.print("enter des file: ");
		String des=scn.nextLine();
		FileInputStream fis=new FileInputStream(src);
		FileOutputStream fos=new FileOutputStream(des);
		int data;
		while((data=fis.read())!=-1){
			fos.write(data);
		}
			System.out.println("data is copied");
		fis.close();
	}
}

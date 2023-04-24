import java.util.Random;
class RandomNumbers{
	public static void main(String[] args) {
		Random ran=new Random();            //Create random class obj
		int randNum=ran.nextInt(1000);		//specify the limit within you want to generate random numbers
		System.out.println(randNum);
		
		
	}
}

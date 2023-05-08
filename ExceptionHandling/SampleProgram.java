class ExceptionHandling {
	void add(){
		int a=10;
		int b=20;
		int c=a/0;
		System.out.println(c);

	}
	public static void main(String[] args) {
		ExceptionHandling e=new ExceptionHandling();
		try{
			e.add();
		}catch(ArithmeticException z){
			System.out.println("Hello");
		}
	}
}

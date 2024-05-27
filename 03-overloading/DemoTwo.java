class Math{
	void add(){
		System.out.println("please provide two numbers");
	}
	void add(int a, int b){
		System.out.println("sum of two integers is = " + (a + b));
	}
	void add(double a, double b){
		System.out.println("sum of two double precision floating point is = " + (a + b));
	}
	void add(long a, long b){
		System.out.println("sum of two long numbers is =  " + (a + b));
	}
}
class DemoTwo{
	public static void main(String[] args){
		Math m = new Math();
		m.add();//invokes first method
		m.add(5,6);//invokes second method
		m.add(22.18,3.947);//invokes third method
		m.add(7795L,9576L);//invokes fourth method
	}
}

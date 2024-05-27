class Alpha{

	void m1(){

		final int i;//declaring a final local variable
		i = 10;//first time initialisation will not give any error
		System.out.println("value of i is : " + i);
		i = 20;//error: re-initialising a final variable is not permitted
		
	}

}
class DemoTwelve{

	public static void main(String[] args){

		Alpha a = new Alpha();
		a.m1();
	}
}
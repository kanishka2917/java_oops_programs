class Test{
	void fun(){
		System.out.println("No inputs");
	}
	void fun(int a){
		System.out.println("One Input - Integer value = " + a);
	}
	void fun(int a, double d){
		System.out.println("Two Inputs - Integer value = " + a + " & double value = " + d);
	}
	void fun(double d, int a){
		System.out.println("Two Inputs - Double value = " + a + " & integer value = " + a);
	}
	void fun(double d){
		System.out.println("One Input - double value = " + d);
	}
}

class DemoOne{
	public static void main(String args[]){
		Test t = new Test();
		t.fun(5,18.2);//invokes the third method
		t.fun(5);//invokes the two method
		t.fun();//invokes first method
		t.fun(21.2,8);//invokes the fourth method
		t.fun(22.05);//invokes the fifth method
	}
}

class A{

	int j;
	int i;

	void print(){

		System.out.println("value of i = " + i);
		System.out.println("value of j = " + j);
	}
}


class B extends A{

	int p;
	int q;

	void show(){

		System.out.println("value of p = " + p);
		System.out.println("value of q = " + q);
	}
}


class DemoOne{
	
	public static void main(String[] args){
		//A a = new A();// is not nessesary as it alreay extended with class B and now class A is a super class
		B b = new B();//since it is a sub class, i can access class a too
		b.p = 15;
		b.q = 20;
		b.j = 10;
		b.i = 5;
		b.show();
		b.print();
	}
}

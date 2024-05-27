class Alpha{

	final int i;

	{

		this.i = 25;//initialising a final variable inside a instance block is permitted
	}
	
	void m1(int i){

		//this.i = i;//re-assinging a final instance variable not permitted
	}
}

class DemoSeven{

	public static void main(String[] args){

		Alpha a = new Alpha();
		System.out.println("value of i : " + a.i);
		//a.i = 35;////re-assinging a final instance variable not permitted
		System.out.println("value of i : " + a.i);
		
	}
}

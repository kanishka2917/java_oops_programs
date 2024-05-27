class Alpha{

	final int i;
	//not initializing a final variable inside a constructor or instance block or hardcoding will give us error 

	
	void m1(int i){

		//this.i = i;//re-assinging a final instance variable not permitted
	}
}

class DemoEight{

	public static void main(String[] args){

		Alpha a = new Alpha();
		System.out.println("value of i : " + a.i);
		//a.i = 35;////re-assinging a final instance variable not permitted
		System.out.println("value of i : " + a.i);
		
	}
}

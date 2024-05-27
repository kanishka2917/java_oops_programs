class Alpha{

	final int i;

	Alpha(int i){

		this.i = i;//initialising a final variable inside construstor is permitted
	}
	
	void m1(int i){

		//this.i = i;//re-assinging a final instance variable not permitted
	}
}

class DemoSix{

	public static void main(String[] args){

		Alpha a = new Alpha(25);
		System.out.println("value of i : " + a.i);
		//a.i = 35;////re-assinging a final instance variable not permitted
		System.out.println("value of i : " + a.i);
		
	}
}

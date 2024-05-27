class Alpha{

	int p = 15;
	double q = 3.142;
	static int i = 25;
	static double j = 1.1412;
	
	//Instance method
	void print(){
		System.out.println("inside instance block");
		System.out.println(p);//accessing an instance variable p
		System.out.println(q);//accessing an instance variable q
	}
	
	//static method
	static void show(){

		System.out.println("inside satic block");
		System.out.println(i);//accessing static variable i
		System.out.println(j);//accessing static variable j

		/*
		System.out.println(p);//accessing an instance variable p
		System.out.println(q);//accessing an instance variable q  
		"accessing instance variables in static method will give an error
		*/
	}
}

class DemoFour{

	public static void main(String[] args){
		
		Alpha a;
		a = null;
		a.show();//Indirect Access
		Alpha.show();//Direct Access
	}
}

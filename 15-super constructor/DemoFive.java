class Junior{

	int i;

	Junior(int i){

		this.i = i;
	}
	Junior(){

	}
}

class SubJunior extends Junior{

	String s;

	SubJunior(int i, String s){

		super(i);
		this.s = s;
	}
	SubJunior(){

	}
}

class Senior extends SubJunior{

	double d;

	Senior(int i, String s, double d){

		super(i, s);
		this.d = d;
	}
	Senior(){

	}
}

class DemoFive{

	public static void main(String[] args){

		Senior s = new Senior(20,"pinki",22);
		System.out.println("age of junior : " + s.i);
		System.out.println("name of subjunior : " + s.s);
		System.out.println("age of senior : " + s.d);
	}
}

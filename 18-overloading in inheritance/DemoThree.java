class Ramu{

	static void print(int a, int b){

		System.out.println("ramu is printing integers");
	}

	static void print(String s1, String s2){

		System.out.println("Ramu is printing strings");
	}
}

class Shamu extends Ramu{

}


class DemoThree{

	public static void main(String[] args){

		Shamu.print(5,10);
	}
}

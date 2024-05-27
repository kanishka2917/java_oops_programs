class ShikarDhawan{
	
	void batting(){

		System.out.println("i will bat aggressive");
	}

	 void feilding(){

		System.out.println("do feilding near extra covers");
	 }
}

class YuvarajSingh extends ShikarDhawan{
	
	void batting(){

		System.out.println("i will try to finish the innings");
	}
	 
	void bowling(){

		System.out.println("left arm off spin");
	}

	 void fielding(){

		System.out.println("do fielding at the slip");
	 }
}

class Zaheerkhan extends YuvarajSingh{
	
	void batting(){

		System.out.println("i dont know batting");
	}

	void bowling(){

		System.out.println("left arm fast");
	}

	 void feilding(){

		System.out.println("do feilding in mid-wicket");
	 }
}

class DemoTwo{

	public static void main(String args[]){

		Zaheerkhan z = new Zaheerkhan();
		z.feilding();
	}
}


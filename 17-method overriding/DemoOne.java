class Shewag{
	
	void batting(){

		System.out.println("keep hitting 6's");
	}

	 void bowling(){

		System.out.println("right arm off spin");
	 }
}

class Dravid extends Shewag{
	
	void batting(){

		System.out.println("playing defense like a wall");
	}

	 void fielding(){

		System.out.println("do fielding at the slip");
	 }
}

class Dhoni extends Dravid{
	
	void batting(){

		System.out.println("hit finishing shots");
	}
	 void feilding(){

		System.out.println("do feilding in extra covers");
	 }
}

class DemoOne{

	public static void main(String args[]){

		Dhoni d = new Dhoni();
		d.feilding();
	}
}


class Dog{

	void bark(){

		System.out.println("bow-wow");
	}

	void whenHungry(){

		System.out.println("wag the tail");
	}
	
	void bark(int biscuits){

		if(biscuits > 5){

			System.out.println("dont bark stay silent");
		}

		else{

			System.out.println("bow-wow");
		}
	}
}

class PitBull extends Dog{

	void whenHungry(){

		super.whenHungry();
		System.out.println("aggressive, attacks human flesh");
	}
}


class DemoTwo{

	public static void main(String args[]){

		PitBull pb = new PitBull();
		pb.whenHungry();
	}
}



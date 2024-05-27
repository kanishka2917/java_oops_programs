class Ramu{

	int candy;

	Ramu(int candy){
		
		this.candy = candy;
	}
}
class Shamu extends Ramu{

	int cookie;

	Shamu(int candy, int cookie){

		super(candy);
		this.cookie = cookie;
	}
}
class Bheemu extends Shamu{
	
	int cupcake;

	Bheemu(int candy, int cookie, int cupcake){

		super(candy,cookie);
		this.cupcake = cupcake;
	}
}


class DemoTwo{

	public static void main(String[] args){

		Bheemu b = new Bheemu(95,85,75);
		
	}
}

abstract class Figure{

	int x, y;

	Figure(int x, int y){

		this.x = x;
		this.y = y;
	}

	abstract int area();{

		return ;
	}

	Figure(int x){

		this.x = x;
	}
}
class Rectangle extends Figure{

	Rectangle(int x, int y){

		super(x, y);
	}

	int area(){

		int p;
		p = x * y;
		return p;
	}
}

class Triangle extends Figure{

	Triangle(int x, int y){

		super(x, y);
	}
	
	abstract int area();{

		int p; 
		p = x * y / 2;
		return p;
	}
}

class DemoFour{

	public static void main(String args[]){
		 
		Figure f = new Figure(10, 20);
		int res = f.area();
		res = f.area();
		f = null;
		Triangle t = new Triangle(5,2);
		Rectangle r = new Rectangle(8,3);
		f = t;
		res = t.area();
		System.out.println(res);
		f = r;
		res = f.area();
		System.out.println(res);
	}
}

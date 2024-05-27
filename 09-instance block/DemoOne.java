class Triangle{
	int side_a;
	int side_b;
	int side_c;
	{
		System.out.println("I am a member of class Triangle"); 
		System.out.println("Yes, I am a Instance Block");
	}
	
	void showPerimeter(){
		int perimeter = side_a + side_b + side_c;
		System.out.println("Perimeter of a Triangle is: " + perimeter);
	}
}

class Bean{
	int x;
	int y;

	Bean (int i,int j){
		x = i;
		y = j;
	}
	{
		System.out.println("I am a member of class Bean");
		System.out.println("Yes, I am a Instance Block");
	}
}
	
class DemoOne{
	public static void main(String[] args){
			
			Triangle triangle = new Triangle();
			Bean bean = new Bean (2,3);
	}
}
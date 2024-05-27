class Bean{
	int x;
	int y;

	Bean(int i, int j){
		x = i;
		y = j;
	}
}
class Math{
	void add(int p, int q){
		int result;
		result = p + q;
		System.out.println("sum of two numbers : " + result);
	}

	
	void add(Bean b){
		int result;
		result = b.x + b.y;
		System.out.println("sum of two numbers : " + result);
	}
}


class DemoOne{
	public static void main(String[] args){
		Math m = new Math();//new math object
		m.add(5,10);//call by value

		Bean bean = new Bean(5,10);
		m.add(bean);//call by reference
		
	}
}

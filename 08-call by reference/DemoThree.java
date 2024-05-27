class Bean{

	int x;
	int y;

	Bean(int i, int j){
		x = i;
		y = j;
	}
}
 
class ResultBean{

	int sum;
	int difference;
	int product;
	int quotient;
	int remainder;
}

class Math{

	//creating a new instance of resultBean
	ResultBean allArithemetic(Bean bean){
		ResultBean rs = new ResultBean();
		rs.sum = bean.x + bean.y;
		rs.difference = bean.x - bean.y;
		rs.product = bean.x * bean.y;
		rs.quotient = bean.x / bean.y;
		rs.remainder = bean.x % bean.y;
		return rs;
	}
}

class DemoThree{
	public static void main (String args[]){
		Bean bean = new Bean(12,6);
		Math m = new Math();
		ResultBean result = m.allArithemetic(bean);
		System.out.println("addition result : " + result.sum);
		System.out.println("subtraction result : " + result.difference);
		System.out.println("multiplication result : " + result.product);
		System.out.println("division result : " + result.quotient);
		System.out.println("remainder result : " + result.remainder);
	}
}
class BeanBag{
	private int weight;
	private String color;

	BeanBag(int w, String c){
		weight = w;
		color = c;
	}
	
	void showBeanBag(){
		System.out.println("the color of bean bag is : " + color + "  , weight of the bean bag is " + weight);
	} 
}

class DemoTwo {
	public static void main(String[] args){
		BeanBag bg1 = new BeanBag(18,"blue");
		BeanBag bg2 = new BeanBag(21,"red");
		bg1.showBeanBag();
		bg2.showBeanBag();

		/*bg1.weight = 75;
		bg1.color = "pink";
		bg2.weight = 5;
		bg2.color = "yellow";*/

	}
}

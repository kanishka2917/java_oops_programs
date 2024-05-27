class BeanBag{
	private int weight;
	private String color;

	BeanBag (int weight, String color){
		this.weight = weight;
		this.color = color;
		}
}

class DemoThree{
	public static void main(String[] args){

		BeanBag bl = new BeanBag (18, "Blue"); 
		BeanBag b2 = new BeanBag (21, "Red");
	}
} 
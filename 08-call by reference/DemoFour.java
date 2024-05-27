class BeanBag{
	private int weight;
	private String color;

	BeanBag (int w, String c){
		weight = w;
		color = c;
		}

	protected void finalize(){
		System.out.println("Find new place for your ASS");
		System.out.println("How I Die, Bye Bye");
		}
}

class DemoFour{
	public static void main(String[] args){

		BeanBag bl = new BeanBag (18, "Blue"); 
		BeanBag b2 = new BeanBag (21, "Red");
		bl.finalize();
		b2.finalize();
		b2.finalize();
		bl.finalize();
	}
}
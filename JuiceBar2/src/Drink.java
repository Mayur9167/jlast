
public abstract class Drink {
	private String dname;
	
	Drink(){
	
	}
	public void order(String dname) {
		System.out.println("Placing order for "+dname);
	}
	public void create(){
		System.out.println("Your order is on the way");
		
	}
	public void serve() {
		System.out.println("Your Order is ready");
		
	}
	
}
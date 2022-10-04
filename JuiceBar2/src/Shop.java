import java.util.List;
import java.util.ArrayList;

public class Shop {
	private String name = "juicebar";
	private String location;
	
	public void served() {
		System.out.println("You have been Served ");
		
	}
	
	public Drink order(List<String> name1) {
		Drink d=null;
		System.out.println("You are order is been created "+name1);
		List<String> l1 = new ArrayList<>();
		for(int i=0;i<name1.size();i++) {
		if(name1.contains("MangoShake")) {
			d=new MangoShake();
			l1.add("mango");
			
		}
		if(name1.contains("ChikooShake")){
			d=new ChikooShake();
			l1.add("mango");
		}
		if(name1.contains("AppleJuice")) {
			d=new AppleJuice();
			l1.add("mango");
		}
		if(name1.contains("LimeJuice")) {
			d=new LimeJuice();
			l1.add("mango");
		}
		for(String fl:l1)
			System.out.println(l1);
		return d;
		}
	}
	
	
	
	public Shop(String location) {
		this.location=location;
		System.out.println("You are Welcome to "+name +location);
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}
}
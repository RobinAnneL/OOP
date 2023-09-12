
// Class
public class Product {
	
	// Property
	public String name;
	public int totalPrice;
	public int taxPercentage;
	public int price; 
	
	public void printName() {
		System.out.println(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void defineName(String name) {
		this.name = name;
	}
	
	//public void calculateTotalPrice() {
	//	totalPrice = price * (taxPercentage/100)
	//}
	
	public String description() {
		String a = "Naam is " + name + " en prijs is " +  price;
		return a;
		
		// zelfde: return "Naam is " + name + " en prijs is " +  price
		
		//alles onder de return wordt nooit uitgevoerd, dus mag niet
	}
	
	//No args constructor
	public Product() {
		System.out.println("In constructor");
		price = 10;
		taxPercentage = 21;
	}
	
	//All args constructor
	
	public Product(String name) {
		System.out.println("In constructor met naam " + name);
	}
	
}

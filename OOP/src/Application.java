
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
	
	Product p1;					// Declaration
	p1 = new Product ();		// Assignment
	p1.name = "TV";
//	p1.price = 123;
//	p1.totalPrice = 20;
	p1.printName();
	
	Product p2 = new Product();	// Initialization (dec + ass in 1)
	p2.setName("wasmachine");
	p2.printName();
	
	String antwoord = p1.description();
	System.out.println("Antwoord = " + antwoord);
	
	Product p3 = new Product("Fiets");
	
	
	
	
	//vanaf hier eigen oefening
	
	Boodschappen b1 = new Boodschappen();
	
	b1.kleur = "rood";
	b1.kosten = 1;
//	b1.budget = 20;
	
	b1.printKleur();
	b1.printKosten();
	
	String beschrijving = b1.beschrijvingKleurKosten();
	System.out.println("Beschrijving = " + beschrijving);
	

	
	
	}
	
}

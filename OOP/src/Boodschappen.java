
public class Boodschappen {

	public String kleur;
	public int kosten;
	
	//public int budget;
	
	
	
	public void printKleur() {
		System.out.println("Kleur is " + kleur);
	}
	
	public void stelKleurIn (String kleur) {
		this.kleur = kleur;
	}
	
	public void printKosten() {
		System.out.println("Kosten zijn " + kosten);
	}
	
	public void stelKostenIn (int kosten) {
		this.kosten = kosten;
	}
	
	public String beschrijvingKleurKosten() {
		String a = "Kleur is " + kleur + " en prijs is " +  kosten;
		return a;
	}

	public Boodschappen() {
		System.out.println("In constructor");
		kleur = "geel";
		kosten = 2;
	}
	
	public Boodschappen(String kleur, int kosten) {
		System.out.println("In constructor met kleur " + kleur + " en prijs " + kosten);
	}
	
}

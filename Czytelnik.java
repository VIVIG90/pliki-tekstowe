public class Czytelnik {
	private String imie;
	private String nazwisko;	

	//this jest po to aby rozroznic parametr metody i atrybut
	public Czytelnik(String imie1, String nazwisko1) {
		imie = imie1;
		nazwisko = nazwisko1;
		
	}

  //do wyniku dodany ciag znakow i atrybut
	public String toString() {
		String wynik = "Imie: " + imie + "\n";
		wynik += "Nazwisko: " + nazwisko + "\n";
    //zwracanie dlugiego stringu
		return wynik;
	}
}

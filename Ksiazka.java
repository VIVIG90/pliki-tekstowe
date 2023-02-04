public class Ksiazka {
	private String autor;
	private String tytul;	
	private int rokWydania;
	//this jest po to aby rozroznic parametr metody i atrybut
	public Ksiazka(String autor, String tytul, int rokWydania) {
		this.autor = autor;
		this.tytul = tytul;
		this.rokWydania = rokWydania;
	}
	//get po to aby pobrac atrybuty
	public String getAutor() {
		return autor;
	}
	
	public String getTytul() {
		return tytul;
	}

	public int getRokWydania() {
		return rokWydania;
	}
	//dolaczenie atrybut autor
  //do wyniku dodany ciag znakow i atrybut
	public String toString() {
		String wynik = "Autor: " + autor + "\n";
		wynik += "Tytul: " + tytul + "\n";
		wynik += "Rok: " + rokWydania + "\n";
    //zwracanie dlugiego stringu
		return wynik;
	}
}

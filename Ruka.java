public class Ruka {

	//Zadaci za samostalan rad
	
	private Card[] karte;
	private int brojac;
	private int brojKeceva;
	
	/**
	 * Konstruktor koji kreira niz od 52 karte
	 */
	
	public Ruka()
	{
		karte = new Card[52];
	}
	
	/**
	 * Funkcija koja dodaje jednu kartu u ruku igrača, i provjerava da li je karta as
	 * @param karta
	 */ 
	
	public void dodajKartu(Card karta)
	{
		karte[brojac] = karta;
		brojac++;
		if (karta.getVrijednost() == 11)
		{
			brojKeceva++;
		}
	}
	
	/**
	 * Funkcija koja sabira vrijednosti karata u jednom nizu, s tim da oduzima 10 ako
	 * je jedna od karti as
	 * @return suma
	 */
	
	public int vratiSumu()
	{
		int suma = 0;
		for (int i=0; i<brojac; i++)
		{
			suma += karte[i].getVrijednost();
		}
		if (brojKeceva != 0)
		{
			suma -= 10*brojKeceva; 
		}
		
		return suma;
	}
}

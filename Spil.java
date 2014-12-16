
public class Spil {

	//Zadaci za samostalan rad

	private Card[] spil;
	int brojac;
	
	/**
	 * Konstruktor koji dodjeljuje špilu sve karte, a zatim poziva funkciju za miješanje karti
	 */
	
	public Spil()
	{
		spil = new Card[52];
		
		for (int i=0; i<52; i++)
		{
			spil[i] = new Card(i);
		}
		mijesanjeKarti();
	}
	
	/**
	 * Funkcija koja vraća string sa svim članovima špila
	 */
	
	public String toString()
	{
		String spilKarata = "";
		for (int i=0; i<52; i++)
		{
			spilKarata += spil[i].toString() + "\n";
		}
		return spilKarata;
	}
	
	/**
	 * Funkcija koja simulira miješanje karti. Kartama se dodjeljuju novi indeksi, i to se ponavlja 52 puta
	 */
	
	private void mijesanjeKarti()
	{
		for (int i=0; i<spil.length; i++)
		{
			int index1 = (int)(Math.random() * 52);
			int index2 = (int)(Math.random() * 52);
			Card karta = spil[index1];
			spil[index1] = spil[index2];
			spil[index2] = karta;
		}
	}
	
	/**
	 * Funkcija koja vraća kartu iz promiješanog špila
	 * @return
	 */
	
	public Card getNext()
	{
		if (brojac >= 52)
		{
			throw new IllegalArgumentException("NEEEE!");
		}
		return spil[brojac++];
	}
	
}

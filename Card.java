
public class Card {
	
	//Zadaci za samostalan rad

	private int broj;
	private int vrijednost;
	private String znak;
	
	/**
	 * Konstruktor koji prima broj od 1 do 52 i na osnovu toga dodjeljuje vrijednost varijablama znak i vrijednost
	 * @param broj
	 */
	
	public Card(int broj)
	{
		this.broj = broj % 13;
		this.broj++;
		if (this.broj == 1)
		{
			this.vrijednost = 11;
			
		}
		else if (this.broj >= 10) 
		{
			this.vrijednost = 10;
		}
		else
		{
			this.vrijednost = this.broj;
		}
		if (this.broj >= 11)
		{
			this.broj++;
		}
		if (broj / 13 == 0)
		{
			znak = "Herc";
		}
		else if (broj / 13 == 1)
		{
			znak = "Pik";
		}
		else if (broj / 13 == 2)
		{
			znak = "Baklava";
		}
		else
		{
			znak = "Tref";
		}
		
	}

	/**
	 * Getter za vrijednost
	 * @return
	 */
	
	public int getVrijednost() {
		return vrijednost;
		
	}
	
	/**
	 * Funkcija koja vraća string sa podacima o karti
	 */
	
	public String toString()
	{
		return znak + ", " + this.broj + ", vrijednost: " + vrijednost;
	}
	
}

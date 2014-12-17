
public class Test {

	public static void main(String[] args) {
		Spil spil = new Spil();
		Ruka ruka = new Ruka();
		String unos = "da";
		do
		{
			Card karta = spil.getNext();
			System.out.println("Karta je: " + karta);
			ruka.dodajKartu(karta);
			int suma = ruka.vratiSumu();
			if (suma > 21)
			{
				System.out.println("Izgubili ste!");
				break;
			}
			else if( suma == 21)
			{
				System.out.println("Čestitam, pobijedili ste!");
				break;
			}
			System.out.println("Da li želite još jednu kartu?");
			unos = TextIO.getln();
			
		}while (unos.equals("da"));
		System.out.println("Suma je: " + ruka.vratiSumu());
	}

}

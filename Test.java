
public class Test {

	public static void main(String[] args) {
		
		Spil spil = new Spil();
		
		System.out.println(spil.toString());
		Card karta = spil.getNext();
		System.out.println("Prva karta iz špila: " + karta.toString());
		karta = spil.getNext();
		System.out.println("Druga karta iz špila: " + karta.toString());
		karta = spil.getNext();
		System.out.println("Treća karta iz špila: " + karta.toString());
	}

}

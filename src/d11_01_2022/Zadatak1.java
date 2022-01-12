package d11_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Proizvod brasno = new Proizvod();
		brasno.nazivProizvoda = "Tip500";
		brasno.cena = 100;
		brasno.tezina = 1000;
		brasno.povecajCenu(20.5);
		brasno.stampaj();
		double cenaSaPopustom = brasno.vratiCenuSaPopustom(20);
		System.out.println("Cena sa popustom je: " + cenaSaPopustom);
		int postarina = brasno.racunaPostarinu();
		System.out.println("Postarina je: " + postarina);
		
		System.out.println();

		Proizvod hleb = new Proizvod();
		hleb.nazivProizvoda = "Polubeli";
		hleb.cena = 50;
		hleb.tezina = 600;
		hleb.povecajCenu(5);
		hleb.stampaj();
		cenaSaPopustom = hleb.vratiCenuSaPopustom(15);
		System.out.println("Cena sa popustom je: " + cenaSaPopustom);
		postarina = hleb.racunaPostarinu();
		System.out.println("Postarina je: " + postarina);


	}

}

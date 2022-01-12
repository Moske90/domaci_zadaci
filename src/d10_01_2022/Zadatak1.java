package d10_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Proizvod brasno = new Proizvod();
		brasno.nazivProizvoda = "Tip500";
		brasno.cena = 100;
		brasno.tezina = 1000;
		brasno.stampaj();
		System.out.println();

		Proizvod hleb = new Proizvod();
		hleb.nazivProizvoda = "Polubeli";
		hleb.cena = 50;
		hleb.tezina = 600;
		hleb.stampaj();

	}

}

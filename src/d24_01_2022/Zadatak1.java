package d24_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

//	U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i 
//	istestirati sve metode i ispisati ukupnu cenu sa popustom.

		Korpa korpa = new Korpa();
		SuperKartica kartica = new SuperKartica(792, "Nikola Boskovic", 200);

		korpa.dodajAmbalazu(new Tetrapak("123456", "Mleko", 0.2, 1, true, 70));
		korpa.dodajAmbalazu(new Tetrapak("123457", "Sok od jabuke", 0.3, 1.5, true, 120));
		korpa.dodajAmbalazu(new StaklenaAmbalaza("234568", "Pivo", 1, 1.5, 20, true, 50));
		korpa.dodajAmbalazu(new StaklenaAmbalaza("234569", "Kokta", 0.7, 1.2, 0, false, 60));

		korpa.izbaciAmbalazu("123457");
		System.out.println("Cena korpe: " + korpa.cenaKorpe(kartica));

	}

}

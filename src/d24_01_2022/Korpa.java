package d24_01_2022;

import java.util.ArrayList;

public class Korpa {

//	Kreirati klasu Korpa koja ima:
//		niz ambalaza
//		metodu dodaj ambalazu
//		metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//		privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//		metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.

	private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<Ambalaza>();

	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.nizAmbalaza.add(ambalaza);
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			if (this.nizAmbalaza.get(i).getBarkod().equals(barkod)) {
				this.nizAmbalaza.remove(i);
			}
		}
	}

	private double cenaSvihAmbalazaSaPopustom(int popust) {
		double ukupnaCena = 0;
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			ukupnaCena = ukupnaCena + this.nizAmbalaza.get(i).cenaArtikla();
		}
		return ukupnaCena - popust;
	}

	public double cenaKorpe(SuperKartica kartica) {
		return this.cenaSvihAmbalazaSaPopustom(kartica.getPupust());
	}
}

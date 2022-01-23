package d21_01_2022;

import java.util.ArrayList;

public abstract class Radnik {
//	Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

	protected String imeIPrezime;
	protected ArrayList<Sektor> sektori = new ArrayList<Sektor>();

	public Radnik() {

	}

	public Radnik(String imeIPrezime) {
		super();
		this.imeIPrezime = imeIPrezime;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public abstract double plataRadnika();

	public void zaposliUSektoru(Sektor sektor) {
		this.sektori.add(sektor);
	}
}

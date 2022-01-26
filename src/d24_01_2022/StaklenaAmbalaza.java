package d24_01_2022;

public class StaklenaAmbalaza extends Ambalaza {

//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu
//		ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//		ako se ne placa, (osnovna cena) * 1.2
//		metoda stampaj stampa sve podatke iz klase staklena flasa.

	private int kaucija;
	private boolean daLiSePlacaKaucija;
	private int osnovnaCena;

	public StaklenaAmbalaza() {
		super();
	}

	public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, int kaucija,
			boolean daLiSePlacaKaucija, int osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public int getKaucija() {
		return kaucija;
	}

	public void setKaucija(int kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isDaLiSePlacaKaucija() {
		return daLiSePlacaKaucija;
	}

	public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
	}

	public int getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(int osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if (this.daLiSePlacaKaucija) {
			return this.osnovnaCena * 1.2 + this.kaucija;
		} else {
			return this.osnovnaCena * 1.2;
		}

	}

	@Override
	public void print() {
		System.out.println("Naziv artikla: " + this.nazivArtikla);
		System.out.println("Barkod: " + this.barkod);
		System.out.println("Tezina artikla: " + this.brutoTezina);
		System.out.println("Tezina Pakovanja: ");
		System.out.print("Kaucija: ");
		if (this.daLiSePlacaKaucija) {
			System.out.println("da");
		} else {
			System.out.println("ne");
		}
		System.out.println("Cena artikla: " + this.cenaArtikla());
	}

}

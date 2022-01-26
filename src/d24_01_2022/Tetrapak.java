package d24_01_2022;

public class Tetrapak extends Ambalaza {

//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
//		metoda stampaj stampa sve podatke iz klase tetrapak.

	private boolean daLiSeMozeReciklirati;
	private int osnovnaCena;

	public Tetrapak() {
		super();
	}

	public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean recikliraSe,
			int cena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.daLiSeMozeReciklirati = recikliraSe;
		this.osnovnaCena = cena;
	}

	public boolean isDaLiSeMozeReciklirati() {
		return daLiSeMozeReciklirati;
	}

	public void setDaLiSeMozeReciklirati(boolean daLiSeMozeReciklirati) {
		this.daLiSeMozeReciklirati = daLiSeMozeReciklirati;
	}

	public int getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(int osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if (this.daLiSeMozeReciklirati) {
			return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
		} else {
			return this.osnovnaCena;
		}

	}

	@Override
	public void print() {
		System.out.println("Naziv artikla: " + this.nazivArtikla);
		System.out.println("Barkod: " + this.barkod);
		System.out.println("Tezina artikla: " + this.brutoTezina);
		System.out.println("Tezina Pakovanja: ");
		System.out.print("Reciklira se: ");
		if (this.daLiSeMozeReciklirati) {
			System.out.println("da");
		} else {
			System.out.println("ne");
		}
		System.out.println("Cena artikla: " + this.cenaArtikla());
	}

}

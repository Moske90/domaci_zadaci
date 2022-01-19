package d17_01_2022;

public class Transakcija {

	private String idTransakcije;
	private Racun na;
	private Racun sa;

	public Transakcija() {

	}

	public Transakcija(String idTransakcije, Racun na, Racun sa) {
		super();
		this.idTransakcije = idTransakcije;
		this.na = na;
		this.sa = sa;
	}

	public String getIdTransakcije() {
		return idTransakcije;
	}

	public void setIdTransakcije(String idTransakcije) {
		this.idTransakcije = idTransakcije;
	}

	public Racun getNa() {
		return na;
	}

	public void setNa(Racun na) {
		this.na = na;
	}

	public Racun getSa() {
		return sa;
	}

	public void setSa(Racun sa) {
		this.sa = sa;
	}

	private int provizija(int visinaTransakcije) {
		if (visinaTransakcije < 4500) {
			return 45;
		} else {
			return visinaTransakcije / 100;
		}
	}

	public void izvrsiTransakciju(int visinaTransakcije) {
		if (this.sa.getTrenutnoStanje() >= visinaTransakcije + this.provizija(visinaTransakcije)) {
			this.sa.novoStanje(visinaTransakcije + this.provizija(visinaTransakcije));
			this.na.novoStanje(-visinaTransakcije);
		}
	}

	public void stampaj() {
		System.out.println(this.idTransakcije);
		System.out.println(this.sa.getImeIPrezimeVlasnika() + " - " + this.sa.getBrojRacuna());
		System.out.println(this.na.getImeIPrezimeVlasnika() + " - " + this.na.getBrojRacuna());

	}
}

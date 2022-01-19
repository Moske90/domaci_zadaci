package d17_01_2022;

public class Racun {

	private String brojRacuna;
	private String imeIPrezimeVlasnika;
	private int trenutnoStanje;

	public Racun() {

	}

	public Racun(String brojRacuna, String imeIPrezimeVlasnika, int trenutnoStanje) {
		this.brojRacuna = brojRacuna;
		this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
		this.trenutnoStanje = trenutnoStanje;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getImeIPrezimeVlasnika() {
		return imeIPrezimeVlasnika;
	}

	public void setImeIPrezimeVlasnika(String imeIPrezimeVlasnika) {
		this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
	}

	public int getTrenutnoStanje() {
		return trenutnoStanje;
	}

	public void novoStanje(int visinaTransakcije) {
		this.trenutnoStanje = this.trenutnoStanje - visinaTransakcije;
	}

	public void stampaj() {
		System.out.println(this.imeIPrezimeVlasnika + " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je " + this.trenutnoStanje + " rsd.");
	}
}

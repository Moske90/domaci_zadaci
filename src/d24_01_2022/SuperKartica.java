package d24_01_2022;

public class SuperKartica {

//	Kreirati klasu SuperKartica koja ima:
//		broj kartice
//		ime i prezime vlasnika
//		popust (200, 500, … )
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere 
//		metodu stampaj koja stampa karticu u formatu:
//		(broj kartice), (ime i prezime)

	private int brojKartice;
	private String imeIPrezimeVlasnika;
	private int pupust;

	public SuperKartica() {
		super();
	}

	public SuperKartica(int brojKartice, String imeIPrezimeVlasnika, int pupust) {
		super();
		this.brojKartice = brojKartice;
		this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
		this.pupust = pupust;
	}

	public int getBrojKartice() {
		return brojKartice;
	}

	public void setBrojKartice(int brojKartice) {
		this.brojKartice = brojKartice;
	}

	public String getImeIPrezimeVlasnika() {
		return imeIPrezimeVlasnika;
	}

	public void setImeIPrezimeVlasnika(String imeIPrezimeVlasnika) {
		this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
	}

	public int getPupust() {
		return pupust;
	}

	public void setPupust(int pupust) {
		this.pupust = pupust;
	}

	public void print() {
		System.out.println(this.brojKartice + ", " + this.imeIPrezimeVlasnika);
	}

}

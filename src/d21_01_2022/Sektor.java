package d21_01_2022;

public class Sektor {
//	Kreirati klasu Sektor koja ima:
//		 naziv sektora
//		 platu koja je za taj sektor

	protected String nazivSektora;
	protected int plataZaSektor;

	public Sektor(String nazivSektora, int plataZaSektor) {
		super();
		this.nazivSektora = nazivSektora;
		this.plataZaSektor = plataZaSektor;
	}

	public String getNazivSektora() {
		return nazivSektora;
	}

	public void setNazivSektora(String nazivSektora) {
		this.nazivSektora = nazivSektora;
	}

	public int getPlataZaSektor() {
		return plataZaSektor;
	}

	public void setPlataZaSektor(int plataZaSektor) {
		this.plataZaSektor = plataZaSektor;
	}

}

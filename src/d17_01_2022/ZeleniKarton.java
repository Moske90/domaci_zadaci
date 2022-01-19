package d17_01_2022;

public class ZeleniKarton {

	private String imeIPrezimeStudenta;
	private String brojIndeksa;
	private String nazivPredmeta;
	private String imeIPrezimeProfesora;
	private int ocena;

	public ZeleniKarton() {

	}

	public ZeleniKarton(String imeIPrezimeStudenta, String brojIndeksa, String nazivPredmeta,
			String imeIPrezimeProfesora, int ocena) {
		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
		this.brojIndeksa = brojIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
		this.ocena = ocena;
	}

	public String getImeIPrezimeStudenta() {
		return imeIPrezimeStudenta;
	}

	public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeIPrezimeProfesora() {
		return imeIPrezimeProfesora;
	}

	public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public boolean daLiJeIspitPolozen() {
		return this.ocena > 5;
	}

	public void print() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imeIPrezimeStudenta + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.imeIPrezimeProfesora);
	}

}

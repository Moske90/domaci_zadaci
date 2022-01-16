package d13_01_2022;

public class FacebookPost {
	
	private String imeIPrezimeKorisnika;
	private String cijiJeProfil;
	private String tekstObjave;
	private int brojLajkova;
	private int brojDeljenja;
	
	public FacebookPost() {
		
	}
	
	public FacebookPost(String imeIPrezime, String cijiJeProfil, String tekstObjave) {
		this.imeIPrezimeKorisnika = imeIPrezime;
		this.cijiJeProfil = cijiJeProfil;
		this.tekstObjave = tekstObjave;
	}
	
	public void setImeIPrezimeKorisnika(String imeIPrezime) {
		this.imeIPrezimeKorisnika = imeIPrezime;
	}
	
	public String getImeIPrezimeKorisnika() {
		return this.imeIPrezimeKorisnika;
	}
	
	public void setCijiJeProfil(String cijiJeProfil) {
		this.cijiJeProfil = cijiJeProfil;
	}
	
	public String getCijiJeProfila() {
		return this.cijiJeProfil;
	}
	
	public void setTekstObjave(String tekstObjave) {
		this.tekstObjave = tekstObjave;
	}
	
	public String getTekstObjave() {
		return this.tekstObjave;
	}
	
	public int getBrojLajkova() {
		return this.brojLajkova;
	}

	public int getBrojDeljenja() {
		return this.brojDeljenja;
	}
	
	public void like() {
		this.brojLajkova = this.brojLajkova + 1;
	}

	public void dislike() {
		if (this.brojLajkova > 0) {
			this.brojLajkova = this.brojLajkova - 1;
		}
	}

	public void share() {
		this.brojDeljenja = this.brojDeljenja + 1;
	}

	public void print() {
		System.out.println(this.imeIPrezimeKorisnika + " >>> " + this.cijiJeProfil);
		System.out.println(this.tekstObjave);
		System.out.println("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja);
	}
}

package d11_01_2022;

public class FacebookPost {

	String imeIPrezime;
	String cijiJeProfil;
	String tekstObjave;
	int brojLajkova;
	int brojDeljenja;

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
		System.out.println(this.imeIPrezime + " >>> " + this.cijiJeProfil);
		System.out.println(this.tekstObjave);
		System.out.println("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja);
	}
}

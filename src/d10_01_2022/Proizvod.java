package d10_01_2022;

public class Proizvod {

	String nazivProizvoda;
	double cena;
	double tezina;

	public void stampaj() {
		System.out.println(this.nazivProizvoda + ", " + this.cena + "din, " + this.tezina + "g");
	}

}

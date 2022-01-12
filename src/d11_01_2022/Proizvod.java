package d11_01_2022;

public class Proizvod {
	
	String nazivProizvoda;
	double cena;
	double tezina;
	
	public void stampaj() {
		System.out.println(this.nazivProizvoda + ", " + this.cena + "din, " + this.tezina + "g");
	}
	
	public void povecajCenu(double povecanje) {
		this.cena = this.cena + povecanje;
	}
	
	public double vratiCenuSaPopustom (double popust) {
		double cenaSaPopustom = this.cena - popust;
		return cenaSaPopustom;
	}
	
	public int racunaPostarinu() {
		int postarina;
		if(this.cena <= 100) {
			postarina = 200;
		}else if(this.cena > 100 && this.cena <= 500) {
			postarina = 400;
		}else {
			postarina = 1000;
		}
		return postarina;
	}
}

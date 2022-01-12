package d11_01_2022;

public class SmartAirConditioning {

	String markaKlime;
	int potrosnjaDokHladi;
	int potrosnjaDokGreje;
	int temperatura;
	String mod;

	public void stampaj() {
		System.out.println("Marka: " + this.markaKlime);
		System.out.println("Temperatura: " + this.temperatura);
		System.out.println("Mod: " + this.mod);
	}

	// nisam siguran da sam ukapirao ovu metodu, to jest sta se trazi
	public int mesecnaPotrosnja() {
		int mesecnaPotrosnja;
		if (this.mod.equals("Hladjenje")) {
			mesecnaPotrosnja = 30 * 15 * this.potrosnjaDokHladi;
		} else {
			mesecnaPotrosnja = 30 * 15 * this.potrosnjaDokGreje;
		}
		return mesecnaPotrosnja;
	}

	public int mesecniTroskovi(int mesecnaPotrosnjaUKWH) {
		int troskovi = 0;
		for (int i = 0; i < mesecnaPotrosnjaUKWH; i++) {
			if (i < 350) {
				troskovi = troskovi + 6;
			} else {
				troskovi = troskovi + 9;
			}
		}
		return troskovi;

	}
}

package d11_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		SmartAirConditioning klima1 = new SmartAirConditioning();
		klima1.markaKlime = "Samsung";
		klima1.potrosnjaDokHladi = 1;
		klima1.potrosnjaDokGreje = 2;
		klima1.temperatura = 25;
		klima1.mod = "Grejanje";
		klima1.stampaj();

		int mesecnaPotrosnja = klima1.mesecnaPotrosnja();
		System.out.println("Mesecna potrosnja je: " + mesecnaPotrosnja + "kw/h");

		int mesecniTroskovi = klima1.mesecniTroskovi(351);
		System.out.println("Troskovi za ovaj mesec iznose: " + mesecniTroskovi);
	}

}

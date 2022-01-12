package d10_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		SmartAirConditioning klima1 = new SmartAirConditioning();
		klima1.markaKlime = "Samsung";
		klima1.temperatura = 25;
		klima1.mod = "grejanje";
		klima1.stampaj();
		
		System.out.println();

		SmartAirConditioning klima2 = new SmartAirConditioning();
		klima2.markaKlime = "Galanz";
		klima2.temperatura = 17;
		klima2.mod = "hladjenje";
		klima2.stampaj();
	}

}

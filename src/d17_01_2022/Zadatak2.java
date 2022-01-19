package d17_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Racun sa = new Racun("170-289328923-23", "Pera Peric", 15000);
		Racun na = new Racun("170-289328923-24", "Djura Djuric", 4500);
		Transakcija transakcija = new Transakcija("028/M", na, sa);
		transakcija.stampaj();
		transakcija.izvrsiTransakciju(14900);
		sa.stampaj();
		na.stampaj();
		
	}

}

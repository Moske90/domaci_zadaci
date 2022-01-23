package d20_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

		Igrac igrac1 = new Igrac("Ronaldo Ronaldo", "0504979", 1979, 9, "napadac", true);
		Igrac igrac2 = new Igrac("Raul Gonzales", "2709975", 1975, 11, "napadac", true);

		Trener trener1 = new Trener("Radomir Antic", "0111949", 1949, 45, "selektor");
		Trener trener2 = new Trener("Dejan Stankovic", "1507980", 1980, 7, "prvi trener");

		igrac1.print();
		igrac2.print();
		trener1.print();
		trener2.print();
	}

}

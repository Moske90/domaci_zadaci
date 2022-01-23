package d21_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog

		Magacioner magacioner = new Magacioner("Mile Petrovic");
		Menadzer menadzer = new Menadzer("Jovan Bozovic");
		Sektor sektor1 = new Sektor("Auto industrija", 60000);
		Sektor sektor2 = new Sektor("Ekonomija", 90000);
		Sektor sektor3 = new Sektor("Vojna industrija", 80000);
		Sektor sektor4 = new Sektor("IT", 300000);

		magacioner.zaposliUSektoru(sektor1);
		magacioner.zaposliUSektoru(sektor3);
		menadzer.zaposliUSektoru(sektor2);
		menadzer.zaposliUSektoru(sektor4);

		System.out.println("Plata menadzera: " + menadzer.plataRadnika());
		System.out.println("Plata magacionera: " + magacioner.plataRadnika());

	}

}

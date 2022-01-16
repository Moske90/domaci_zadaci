package d11_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {

		FacebookPost objava1 = new FacebookPost();
		objava1.imeIPrezime = "Pera Peric";
		objava1.cijiJeProfil = "Djura Djuric";
		objava1.tekstObjave = "Sta ima";
		objava1.brojLajkova = 3;
		objava1.brojDeljenja = 0;
		objava1.dislike();
		objava1.share();
		objava1.print();

		System.out.println();

		FacebookPost objava2 = new FacebookPost();
		objava2.imeIPrezime = "Djura Djuric";
		objava2.cijiJeProfil = "Pera Peric";
		objava2.tekstObjave = "Pazi ovo";
		objava2.brojLajkova = 32;
		objava2.brojDeljenja = 5;
		objava2.like();
		objava2.like();
		objava2.share();
		objava2.print();

	}

}

package d13_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		FacebookPost objava1 = new FacebookPost();
		objava1.setImeIPrezimeKorisnika("Pera Peric");
		objava1.setCijiJeProfil("Djura Djuric");
		objava1.setTekstObjave("Sta ima");
		objava1.like();
		objava1.dislike();
		objava1.share();
		objava1.print();

		System.out.println();

		FacebookPost objava2 = new FacebookPost("Djura Djuric", "Pera Peric", "Pazi ovo!");
		objava2.like();
		objava2.like();
		objava2.share();
		System.out.println(objava2.getImeIPrezimeKorisnika() + " >>> " + objava2.getCijiJeProfila());
		System.out.println(objava2.getTekstObjave());
		System.out.println("Likes " + objava2.getBrojLajkova() + " | Shares " + objava2.getBrojDeljenja());
		

	}

}

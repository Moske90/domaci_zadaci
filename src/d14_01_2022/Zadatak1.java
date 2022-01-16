package d14_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor("Mesa", "Selimovic");
		Knjiga knjiga1 = new Knjiga("978-564", "Tvrdjava", 1970, autor1);
		knjiga1.print();

		Autor autor2 = new Autor("Ivo", "Andric");
		Knjiga knjiga2 = new Knjiga("987-456", "Na Drini cuprija", 1945, autor2);
		knjiga2.print();

	}

}

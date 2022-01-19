package d18_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Ispit ispit1 = new Ispit("Poslovna ekonomija", 8, "Goran Nikolic");
		Ispit ispit2 = new Ispit("Medjunarodni ekonomski odnosi", 10, "Jovan Gavrilovic");
		Ispit ispit3 = new Ispit("Sociologija", 5, "Jelica Milosevic");
		Ispit ispit4 = new Ispit("Matematika 2", 7, "Milos Gojkovic");
		Student student = new Student("232/209", "Djura Djuric", "osnovne");

		student.dodajIspit(ispit1);
		student.dodajIspit(ispit2);
		student.dodajIspit(ispit3);
		student.dodajIspit(ispit4);

		student.print();
	}

}

package d17_01_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ZeleniKarton ispit1 = new ZeleniKarton("Milan Markovic", "13/2009", "Poslovna ekonomija", "Goran Nikolic", 8);
		ZeleniKarton ispit2 = new ZeleniKarton("Veljko Bojovic", "232/2007", "Nacionalna ekonomija", "Boban Brajovic",
				5);
		ZeleniKarton ispit3 = new ZeleniKarton("Jelena Popovic", "57/2009", "Medjunarodni ekonomski odnosi",
				"Jovan Gavrilovic", 10);
		ZeleniKarton ispit4 = new ZeleniKarton("Biljana Petkovic", "174/2009", "Sociologija", "Jelica Milosevic", 9);
		ZeleniKarton ispit5 = new ZeleniKarton("Stefan Nikolic", "98/2008", "Matematika 2", "Milos Gojkovic", 7);
//		...
		ArrayList<ZeleniKarton> lista = new ArrayList<ZeleniKarton>();
		lista.add(ispit1);
		lista.add(ispit2);
		lista.add(ispit3);
		lista.add(ispit4);
		lista.add(ispit5);

		for (int i = 0; i < lista.size(); i++) {
			lista.get(i).print();
		}

		int suma = 0;
		int suma1 = 0;
		int brojac = 0;
		for (int i = 0; i < lista.size(); i++) {
			suma = suma + lista.get(i).getOcena();
			if (lista.get(i).getOcena() > 5) {
				suma1 = suma1 + lista.get(i).getOcena();
				brojac = brojac + 1;
			}
		}

		System.out.println("Prosecna ocena je: " + suma * 1.0 / lista.size());
		System.out.println("Prosecna ocena polozenih ispita je: " + suma1 * 1.0 / brojac);
	}

}

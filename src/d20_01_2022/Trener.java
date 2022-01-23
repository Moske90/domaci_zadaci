package d20_01_2022;

public class Trener extends Osoba {

//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

	private int godineIskustva;
	private String tipTrenera;
	
	public Trener() {
		super();
	}

	public Trener(String imeIPrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
		super(imeIPrezime, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}

	public void print() {
		super.print();
		System.out.println(this.godineIskustva + " - " + this.tipTrenera);
	}
}

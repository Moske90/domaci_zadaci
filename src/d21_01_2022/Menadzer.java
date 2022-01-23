package d21_01_2022;

import java.util.ArrayList;

public class Menadzer extends Radnik {
//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

	public Menadzer() {

	}

	public Menadzer(String imeIPrezime) {
		super(imeIPrezime);
	}

	@Override
	public double plataRadnika() {
		int plata = 0;
		for (int i = 0; i < sektori.size(); i++) {
			plata = plata + this.sektori.get(i).getPlataZaSektor();
		}
		return plata;
	}

}

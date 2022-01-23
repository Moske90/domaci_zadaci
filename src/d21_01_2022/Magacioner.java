package d21_01_2022;

import java.util.ArrayList;

public class Magacioner extends Radnik {
//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).

	public Magacioner(String imeIPrezime) {
		super(imeIPrezime);
	}

	private double prosecnaPlata() {
		int plata = 0;
		for (int i = 0; i < sektori.size(); i++) {
			plata = plata + this.sektori.get(i).getPlataZaSektor();
		}
		return plata / this.sektori.size();
	}

	@Override
	public double plataRadnika() {
		return this.prosecnaPlata() * this.sektori.size();
	}

}

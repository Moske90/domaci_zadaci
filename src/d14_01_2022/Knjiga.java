package d14_01_2022;

public class Knjiga {
	
	private String isbn;
	private String nazivDela;
	private int godinaIzdanja;
	private Autor autor;

	public Knjiga() {

	}

	public Knjiga(String isbn, String naziv, int godina, Autor autor) {
		this.isbn = isbn;
		this.nazivDela = naziv;
		this.godinaIzdanja = godina;
		this.autor = autor;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setNaziv(String naziv) {
		this.nazivDela = naziv;
	}

	public String getNaziv() {
		return this.nazivDela;
	}

	public void setGodina(int godina) {
		this.godinaIzdanja = godina;
	}

	public int getGodina() {
		return this.godinaIzdanja;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Autor getAutor() {
		return this.autor;
	}

	public void print() {
		System.out.println(this.isbn);
		System.out.println(this.nazivDela + " - " + this.godinaIzdanja);
		autor.print();
	}
}

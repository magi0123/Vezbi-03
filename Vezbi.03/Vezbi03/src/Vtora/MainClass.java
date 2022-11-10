package Vtora;

public class MainClass {

	public static void main(String[] args) {
		Fakultet f1 = new Fakultet();
		f1.nazivNaFakultet = "FIKT";
		f1.brojNaSmerovi = 5;
		f1.brojNaStudenti = 250;
		f1.dekan = "Pece Mitrevski";
		f1.sediste = "Bitola";

		f1.prvMetod();
		System.out.println("Namalen broj na studenti: " + f1.vtorMetod(0));
		f1.tretMetod();

		Fakultet f2 = new Fakultet();
		f2.nazivNaFakultet = "FINKI";
		f2.brojNaSmerovi = 6;
		f2.brojNaStudenti = 300;
		f2.dekan = "Boro Jakimovski";
		f2.sediste = "Skopje";

		f2.prvMetod();
		System.out.println("Namalen broj na studenti: " + f2.vtorMetod(0));
		f2.tretMetod();
	}
}

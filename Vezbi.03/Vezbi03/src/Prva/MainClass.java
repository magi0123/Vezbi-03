package Prva;

public class MainClass {

	public static void main(String[] args) {
		Avtomobil a = new Avtomobil("Opel", "Corsa", "Bela", 13000, 2012, "BT-879-AA");

		a.prvMetod();
		System.out.println(a.vtorMetod());

	}

}

package Cetvrta;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		int brojNaFrlanja;

		Brojac brPismo = new Brojac();
		Brojac brGlava = new Brojac();

		Scanner s = new Scanner(System.in);
		{
			System.out.println("Vnesete broj na frlanja na parichkata: ");
			brojNaFrlanja = s.nextInt();

			while (brojNaFrlanja > 0) {
				brPismo.reset();
				brGlava.reset();

				for (int i = 0; i < brojNaFrlanja; i++) {
					if (Math.random() < 0.5)
						brPismo.zgolemi();
					else
						brGlava.zgolemi();
				}
				System.out.println("Vo " + brojNaFrlanja + " frlanja");
				System.out.println("Padnaa: " + brPismo.brojac + " pisma");
				System.out.println("Padnaa: " + brGlava.brojac + " glavi");

				System.out.println("Dokolku sakate povtorno frlanje, vnesete broj na frlanja: ");
				brojNaFrlanja = s.nextInt();

			}
			s.close();
		}

	}
}

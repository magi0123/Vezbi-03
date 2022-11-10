//Да се креира класа Avtomobil, со јавни атрибути: marka, model, boja, 
//pominatiKm, godinaNaProizvodstvo, registracija. 
//Класата да има динамичен конструктор кој ќе доделува вредности за сите атрибути. 
//Да има два методи. Првиот метод да печати податоци за марката, моделот и бојата на автомобилот. 
//Вториот метод да ја враќа вредноста за поминатите километри, зголемена за 1520,25. 
//Да се креира главна класа, а во неа еден објект. Да се повикаат двата методи.

package Prva;

public class Avtomobil {

	public String marka;
	public String model;
	public String boja;
	public double pominatiKm;
	public int godinaNaProizvodstvo;
	public String registracija;

	public Avtomobil(String marka, String model, String boja, double pominatiKm, int godinaNaProizvodstvo,
			String registracija) {
		this.marka = marka;
		this.model = model;
		this.boja = boja;
		this.pominatiKm = pominatiKm;
		this.godinaNaProizvodstvo = godinaNaProizvodstvo;
		this.registracija = registracija;
	}

	public void prvMetod() {
		System.out.println(this.marka + ", " + this.model + ", " + this.boja);
	}

	public double vtorMetod() {
		double pKm;
		pKm = this.pominatiKm + 1520.25;
		return pKm;
	}

}


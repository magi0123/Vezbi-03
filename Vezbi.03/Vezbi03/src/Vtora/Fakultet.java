//Да се креира класа Fakultet во која ќе се декларираат пет јавни атрибути: 
//nazivNaFakultet, brojNaSmerovi, brojNaStudenti, dekan, sediste.
//Да има три методи. 
//Првиот метод да не прима влезни аргументи, а негова задача да биде зголемување на бројот на студенти за 50.
//Зголемената вредност да се печати. 
//Вториот метод да прима влезен аргумент int namali, и негова задача да биде намалување на бројот на
//студенти за таа променлива. Методот да ја враќа намалената вредност.
//Третиот метод да ги печати вредностите за nazivNaFakultet и sediste. 
//Дасе креира главна класа. Во неа да се креираат два објекти, да им се
//доделат вредности и сите три методи да се повикаат за двата објекти.

package Vtora;

public class Fakultet {
	public String nazivNaFakultet;
	public int brojNaSmerovi;
	public int brojNaStudenti;
	public String dekan;
	public String sediste;

	public void prvMetod() {
		System.out.println("Zgolemen broj na studenti: " + (this.brojNaStudenti + 50));
	}

	public int vtorMetod(int namali) {
		int namalenaVrednost = brojNaStudenti - namali;
		return namalenaVrednost;
	}

	public void tretMetod() {
		System.out.println("Naziv na fakultet: " + this.nazivNaFakultet + ", Sediste: " + this.sediste);
	}
}

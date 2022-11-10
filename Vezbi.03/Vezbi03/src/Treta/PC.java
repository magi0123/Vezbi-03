//Да се креира класа PC, со јавни атрибути: 
//memorija – целоброен податочен тип, tipNaMemorija – текстуален податочен тип и 
//SSD – целоброен податочен тип. 
//Исто така, да се креира и атрибут од тип String, а името на атрибутот да биде golemina, а вредноста “GB”.
//Класата да има конструктор кој статично ќе ги доделува следните вредности:
//2 – за memorija
//DDR4 – за tipNaMemorija
//256– за SSD
//Да има метод кој ќе прима влезни аргументи: int zgolemiMemorija, int novSSD. 
//Методот да ја зголемува меморијата за соодветниот влезен аргумент, и да печати:
//Memorijata bese __________GB, sega iznesuva__________ GB.
//Tipot na memorijata e __________.
//SSD ima golemina od __________GB. Prethodno iznesuvase __________GB.

package Treta;

public class PC {

	public int memorija;
	public String tipNaMemorija;
	public int SSD;
	public String golemina = "GB";

	public void Pc(String golemina) {
		this.golemina = golemina;
	}

	public PC() {
		this.memorija = 2;
		this.tipNaMemorija = "DDR4";
		this.SSD = 256;

	}

	public int prvMetod(int zgolemiMemorija, int novSSD) {
		int m = memorija + zgolemiMemorija;
		System.out.println("Memorijata bese " + this.memorija + golemina + ", sega iznesuva " + m + golemina + ".");
		System.out.println("Tipot na memorijata e " + this.tipNaMemorija + ".");
		System.out.println(
				"SSD ima golemina od " + novSSD + golemina + ". Prethodno iznesuvase " + this.SSD + golemina + ".");
		return m;

	}

}

//Да се напише програма која симулира фрлање на паричка даден број пати (кој ќе се прима од тастатура) 
//и прикажува колку пати паднало „писмо“ и „глава“. Програмата да користи посебна класа Brojach, 
//која ќе содржи методи за зголемување на бројачот и ресетирање на бројачот.
//Внимателно да се разгледа и да се реши задачата целосно (со креирање на потребните објекти, 
//овозможување да се примаат вредности од тастатура, ресетирање на бројачот, 
//зголемување на вредностите на бројачот и сл.

package Cetvrta;

public class Brojac {
public int brojac;
	
	public void zgolemi () {
		this.brojac++;
	}
	
	public void reset () {
		this.brojac = 0;
	}

}



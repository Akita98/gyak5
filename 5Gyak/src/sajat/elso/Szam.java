package sajat.elso;

public class Szam {
	private double Ertek;
	private static double Tures=0.001;
	
	public Szam(double Ertek){
	this.Ertek = Ertek;
	}
	public boolean EgyezikE(double S){
		return Ertek < S + Tures && Ertek > S-Tures;
	}
	public void SetErtek(double Ertek){
		this.Ertek = Ertek;
	}
	public double getErtek(){
		return Ertek;
	}
}

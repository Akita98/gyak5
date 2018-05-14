package masik;

public class SzamProba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final sajat.elso.Szam FS = new sajat.elso.Szam(0.55);
		
		int N=0;
		double RndNum;
		do{
			RndNum = Math.random();
			System.out.println(RndNum);
			N++;
		}while (!FS.EgyezikE(RndNum));
		System.out.println("Lépésszám: "+N);
	}

}

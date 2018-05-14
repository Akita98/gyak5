
public class Alkalmazott {
	private String nev;
	private int kor;
	private int fizetes;
	
	private static int Nyugdij = 65;
	
	public Alkalmazott(String nev, int kor, int fizetes){
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
	public int HatraVan(){
		return Nyugdij-kor;
	}
	public String Adatok(){
		return"Név" +nev+" kor: " +kor+ " Fizetes: "+fizetes+ "Nyugdijig még" +HatraVan()+" év van hátra";
	}
	static void SetNyugdij(int NyugdijBe){
		Nyugdij = NyugdijBe;
	}
	static boolean NagyobbFizetes(Alkalmazott A1, Alkalmazott A2){
		return A1.fizetes > A2.fizetes;
	}

}

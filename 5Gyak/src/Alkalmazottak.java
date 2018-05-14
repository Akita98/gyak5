import java.util.Scanner;
public class Alkalmazottak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Alkalmazottak Száma: ");
		String s1 = sc.nextLine();
		int N = Integer.parseInt(s1);
		Alkalmazott [] A = new Alkalmazott [N];
		String nev, s2;
		int kor, fizetes;
		for (int i=0; i<N; i++){
			System.out.println(i+". alkalmazott neve: ");
			nev = sc.nextLine();
			System.out.println(i+". alkamazott kora: ");
			s1 = sc.nextLine();
			kor = Integer.parseInt(s1);
			System.out.println(i+". alkmazott fizetése: ");
			s2 = sc.nextLine();
			fizetes = Integer.parseInt(s2);
			A[i] = new Alkalmazott(nev, kor, fizetes);
		}
		for (int i=0; i<N; i++) System.out.println(A[i].Adatok());
		Alkalmazott.SetNyugdij(80);
		for (int i=0; i<N; i++) System.out.println(A[i].Adatok());
		
		int MaxFizIndex = 0;
		for(int i=0; i<N; i++)
			if (Alkalmazott.NagyobbFizetes(A[i], A[MaxFizIndex]))
				MaxFizIndex=i;
				System.out.println("Legnagyobb fizetésû: ");
				System.out.println(A[MaxFizIndex].Adatok());
	}

}

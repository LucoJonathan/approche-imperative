package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chiffre = 1;
		for (int i=0; i<10 ; i++)
		{
			System.out.println(chiffre);
			chiffre++;
		}
		
		String nom = "Jonathan";
		for (int i = 0 ; i<20 ; i++)
		{
			System.out.println(nom);
		}
		
		int paire = 2;
		while(paire<101)
		{
			System.out.println(paire);
			paire = paire +2;
		}
		
		int impair = 1;
		while(impair<100)
		{
			System.out.println(impair);
			impair = impair +2;
		}
			
	}

}

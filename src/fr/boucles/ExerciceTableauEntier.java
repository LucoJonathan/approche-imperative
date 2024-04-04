package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(tab[0]);
		
		System.out.println(" ");
		
		for (int i=0; i<tab.length ; i++)
		{
			System.out.println(tab[i]);
		}
		
		System.out.println(tab[tab.length-1]);
		
		tab[3] = 8;
	}

}

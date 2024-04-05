package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {0,1,2,3};
		int sauv1 = 0;
		int sauv2 = 0;
		
		for (int i = 0 ; i < tab.length ; i++)
		{
			System.out.println(tab[i]);
		}
		sauv2 = tab[0] ;
		sauv1 = tab[1];
		tab[1]= sauv2;
		sauv2 = tab[2];
		tab[2] = sauv1;
		sauv1 = tab[3];
		tab[3] = sauv2;
		tab[0] = sauv1;
		
		for (int i = 0 ; i < tab.length ; i++)
		{
			System.out.println(tab[i]);
		}
	}

}

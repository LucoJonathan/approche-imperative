package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab1 = {1,15,-3,8,7,4,-2,28,-1,17,2,3,0,14,-4};
		int[] tab2 = {3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
		int som = 0;
		
		for (int i = 0 ; i<tab2.length ; i++)
		{
			som = som + tab2[i];
		}
		
		for (int i = 0 ; i<tab1.length ; i++)
		{
			som = som + tab1[i];
		}
		System.out.println(som);
	}

}

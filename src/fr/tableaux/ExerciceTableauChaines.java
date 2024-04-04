package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tab = {"Angers", "Nantes", "Paris", "Tours", "Rennes"};
		for(int i=0 ; i<tab.length ; i++)
		{
			System.out.println(tab[i]);
		}
		
		System.out.println(tab.length);
		
		tab[2] = "Reims";
		
		for(int i=0 ; i<tab.length ; i++)
		{
			System.out.println(tab[i]);
		}
	}

}

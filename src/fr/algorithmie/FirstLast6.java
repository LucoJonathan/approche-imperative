package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab1 = { 6, 0, 5, 6, 1 };
		int[] tab2 = { 1, 5, 4, 8, 1 };

		boolean verif;

		if ((tab1 != null) && ((tab1[0] == 6) || (tab1[tab1.length - 1] == 6))) {
			verif = true;
		} else {
			verif = false;
		}
		System.out.println(verif);
		
		if ((tab2 != null) && ((tab2[0] == 6) || (tab2[tab2.length - 1] == 6))) {
			verif = true;
		} else {
			verif = false;
		}
		
		System.out.println(verif);
	}

}

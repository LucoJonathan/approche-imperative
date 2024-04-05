package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab1 = { 6, 0, 5, 6, 6};
		int[] tab2 = { 1, 5, 6, 8, 7 ,4};

		boolean verif;

		if ((tab1[(tab1.length)-1] >= 1) && (tab1[0] == tab1[tab1.length - 1])) {
			verif = true;
		} else {
			verif = false;
		}
		System.out.println(verif);
		
		if ((tab2[(tab2.length)-1] >= 1) && (tab2[0] == tab2[tab2.length - 1])) {
			verif = true;
		} else {
			verif = false;
		}
		System.out.println(verif);
	}

}

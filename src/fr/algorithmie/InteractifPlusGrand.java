package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] tab = new int[10];
		int max = 0;

		for (int i = 0; i < tab.length; i++) {
			System.out.println("choisir le nombre " + (i + 1) + " à comparer :");
			tab[i] = scanner.nextInt();
			if (max < tab[i]) {
				max = tab[i];
			}
		}
		scanner.close();
		System.out.println("Voici le max de vos nombres : " + max);
	}

}

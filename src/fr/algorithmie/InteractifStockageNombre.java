package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] tab = new int[1];
		int occu = 0;
		int choix = 0;

		while (choix != 2) {
			System.out.println("Choisir de taper :\n" + "1 : Ajouter un nombre au tableau\n"
					+ "2 : Afficher le tableau et donc s'arrêter");
			choix = scanner.nextInt();
			switch (choix) {
			case 1:
				if (occu > tab.length - 1) {
					tab = Arrays.copyOf(tab, tab.length + 1);
					System.out.println("Choisir un nombre");
					tab[occu] = scanner.nextInt();
				} else {
					System.out.println("Choisir un nombre");
					tab[occu] = scanner.nextInt();
				}
				occu++;
				break;
			case 2:
				for (int i = 0; i < tab.length; i++) {
					System.out.println(tab[i]);
				}
			}
		}
		scanner.close();
	}

}

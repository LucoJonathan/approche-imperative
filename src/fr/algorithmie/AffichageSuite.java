package fr.algorithmie;

import java.util.Scanner; // Importation de la class scanner

public class AffichageSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // Création de l'instance scanner
		int choix = 0;
		System.out.println("Bonjour Richard,\nVeuillez choisir " + "quelle point souhaitez vous choisir :\n"
				+ "- Afficher les nombres de 0 à 10 tapez 1\n" + "- Afficher les nombres paire de 0 à 10 tapez 2\n"
				+ "- Afficher les nombres impairs de 0 à 9 tapez 3\n"
				+ "- Afficher les nombres de 1 à 10 avec while tapez 4\n"
				+ "- Afficher les nombres paire de 0 à 10 avec while tapez 5\n"
				+ "- Afficher les nombres impairs de 0 à 9 avec while tapez 6");
		choix = scanner.nextInt(); // Lecture de la saisie clavier

		switch (choix) {
		case 1:

			for (int i = 1; i < 11; i++) {
				System.out.println(i);
			}
			break;

		case 2:
			for (int i = 0; i < 11; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
			break;

		case 3:
			for (int i = 0; i < 10; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
			break;

		case 4:
			int i4 = 1;
			while (i4 < 11) {
				System.out.println(i4);
				i4++;
			}
			break;

		case 5:
			int i5 = 0;
			while (i5 < 11) {
				if (i5 % 2 == 0) {
					System.out.println(i5);
				}
				i5++;
			}
			break;

		case 6:
			int i6 = 0;
			while (i6 < 10) {
				if (i6 % 2 == 1) {
					System.out.println(i6);
				}
				i6++;
			}
			break;

		default:
			System.out.println("Ce n'est pas un choix valide"); // Dans le cas ou la valeurs entier le serais pas la
																// bonne
			break;
		}
		scanner.close(); // Ferme la saisie clavier
	}

}

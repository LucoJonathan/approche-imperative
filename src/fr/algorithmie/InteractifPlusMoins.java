package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int compteur = 0, nbj = 0;
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random(); // Création d'une pseudo seed aléatoire
		int nbalea = rand.nextInt(101); // chiffre compris entre 0 et 100 inclus
		while (nbalea == 0) {
			nbalea = rand.nextInt(101);
		}
		System.out.println("Veuillez choisir un nombre entre 1 et 100 :");
		nbj = scanner.nextInt();
		compteur++;
		while (nbj != nbalea) {
			if (nbj < nbalea) {
				System.out.println("Votre chiffre est plus bas que celui à trouver");
			} else if (nbj > nbalea) {
				System.out.println("Votre chiffre est plus haut que celui à trouver");
			}
			nbj = scanner.nextInt();
			compteur++;
		}
		System.out.println(
				"Bravo vous avez trouver le chiffre " + nbalea + " il vous aura fallu " + compteur + " essais");
		scanner.close();
	}

}

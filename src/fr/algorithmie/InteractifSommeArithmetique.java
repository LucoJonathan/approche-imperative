package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		System.out.println("Veuillez choisir un nombre entier :");
		nb = scanner.nextInt();
		int i = 0;
		int som = 0;
		while (i < nb + 1) {
			som = som + i;
			i++;
		}
		System.out.println("La somme Arithmetique de " + nb + " est " + som);
		scanner.close();
	}

}

package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		do {
			System.out.println("Veuillez choisir un nombre entre 1 et 10 à multiplier :");
			nb = scanner.nextInt();
		} while ((nb < 1) || (nb > 10));
		for (int i = 0; i < 11; i++) {
			System.out.println(i + " * " + nb + " = " + i * nb);
		}
		scanner.close();
	}
}

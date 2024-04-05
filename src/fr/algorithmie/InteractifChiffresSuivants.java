package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nb = 0;
		System.out.println("Veuillez choisir un nombre entier :");
		nb = scanner.nextInt();

		for (int i = 1; i < 11; i++) {
			System.out.println(nb + i);
		}
		scanner.close();
	}

}

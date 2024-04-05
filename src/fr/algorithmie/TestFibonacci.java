package fr.algorithmie;

import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n_1 = 1, n_2 = 0, n = 0;
		int nbj;
		System.out.println("Choisissez votre rang N de la suite Fibonacci : ");
		nbj = scanner.nextInt();
		
		if (nbj == 1 )
		{
			System.out.println("N-2 : " + n_2 );
			System.out.println("Le rang est donc : " + nbj);
		}else {
			for (int i =0 ; i<(nbj-2) ; i++)
			{
				n = n_1 + n_2;
				n_2 = n_1;
				n_1 = n;
			}
			System.out.println("N-2 : " + n_2 + " N-1 : " + n_1);
			System.out.println("Le rang est donc : " + nbj);
		}
		scanner.close();
	}

}

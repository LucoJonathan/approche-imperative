package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		for (int i = 0; i < array.length; i++) {
			// Afficher le tableau
			System.out.println(array[i]);
		}

		for (int i = array.length - 1; i >= 0; i--) {
			// Afficher le tableau dans le sens inverse
			System.out.println(array[i]);
		}

		int[] arrayCopy = new int[array.length]; // Création d'un tableau de copie avec la même place que l'origine
		
		System.arraycopy(array, 0, arrayCopy, 0, array.length);
		
		for (int i = 0 ; i<arrayCopy.length ; i++)
		{
			// Affiche le tableau copié
			System.out.println(arrayCopy[i]);
		}
	}

}

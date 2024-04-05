package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] arrayCopy = new int[array.length]; // Création d'un tableau de copie avec la même place que l'origine
		
		for (int i=0 ; i<array.length; i++)
		{
			// la dernier de la copie prend la valeur de src 1
			arrayCopy[(arrayCopy.length-1) -i] = array[i];
		}
		
		for (int i = 0 ; i < array.length ; i++)
		{
			System.out.println(arrayCopy[i]);
		}
	}

}

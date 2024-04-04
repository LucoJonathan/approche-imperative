package fr.operateurs;

public class DeclarationOperateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b = 20;
		boolean testEt = a>0 && b>10;
		System.out.println(testEt);
		boolean testOu = a>0 || b<10;
		System.out.println(testOu);
		
		a = a+1;
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		a+=1;
		System.out.println(a);
		
		String c = a>0 ? "a est plsu grand que 0": "a est inférieur à 0";
		System.out.println(c);
		
	}

}

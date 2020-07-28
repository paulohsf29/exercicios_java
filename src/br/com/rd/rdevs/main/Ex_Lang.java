package br.com.rd.rdevs.main;

public class Ex_Lang {

	public static void main(String[] args) {
//		String s1 = "Gosto de bolinhos";
//		String s2 = "bolinhos";
//		
//		System.out.println(s1.contains(s2));
//		
//		//ex1.2
//		String s3 = " teste ";
//		
//		System.out.println(s3.trim());
//		
//		//ex1.3
//		String string4 = "";
//		System.out.println(string4.isEmpty());
//		
//		//ex1.4
//		String string5 = "Testa quantidade";
//		System.out.println(string5.length());
//		
//		//ex2
//		String string6 = "Teste";
//		
//		for(int i = 0; i < string6.length(); i++) {
//			System.out.println(string6.charAt(i));
//		}
//		
//		//ex3
//		String palindromo = "Socorram-me, subi no ônibus em Marrocos";
//		String palindromo2="";
//		for(int i = palindromo.length() - 1; i>=0; i--) {
//			
//			palindromo2 += palindromo.charAt(i);	
//		}
//		
//		System.out.println(palindromo2);
//		
//		String palindromo3 = "anotaram a data da maratona";
//		String palindromo4="";
//		
//		for(int i = palindromo3.length() - 1; i>=0; i--) {
//			
//			palindromo4 += palindromo3.charAt(i);	
//		}
//		
//		System.out.println(palindromo4);
//		
		
		
		//ex 4
		String string8 = "762";
		int potencia = string8.length();
		int resultado=0;
		int caracterConv=0;
		
		for(int i = 0 ; i < string8.length(); i++) {
			potencia--;
			caracterConv = string8.charAt(i);
			if(potencia == 0) {
				resultado += caracterConv;
				System.out.println(resultado);
			}else {
				resultado = resultado + ((int) (Math.pow(10, potencia)) * caracterConv);
				System.out.println(resultado);
			}
			System.out.println(potencia);
			
		}
		System.out.println(resultado);
		//System.out.println(Math.pow(10,2));
		
		
		
	}

}

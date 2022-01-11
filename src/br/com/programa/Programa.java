package br.com.programa;

public class Programa {

	public static void main(String[] args) {
		
		try {
			String texto = args[1];
			System.out.println(texto);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Deu certo tambem vai!");
		}
	
		
		
}
	}

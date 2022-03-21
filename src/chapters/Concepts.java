package chapters;

public class Concepts {
	public void conceitos() {
		
		int i = 100000000; //4 bytes para armazenas números inteiros
		long l = 1000000000; // Maior em armazenamento para inteiros. 8 bytes
		short s = 10000; //2 bytes para armazenas números inteiros.
		byte b = 127; //Menor em armazenamento para inteiros. Armaneza inteiros de 0 a 127. 1 byte apenas
		double d = 5.3; //8 bytes para armazenas numeros flutuantes
		float f = 4.1f; //4 bytes para armazenas numeros flutuantes
		char c = 'c'; //2 bytes para armazenar caracteres
		boolean var = true; //true or false. Apenas um 1 bit;
		System.out.println("Valor da variável: " + var);
		
		System.out.println("\nCasting");
		i = (int) d; //Transforma em inteiro o valor contido em 'd'
		s = (short) f; //Transforma em short o valor contido em 'f'
		f = (float) d; //Transforma em float o valor contido em 'd'
		System.out.println(i + " " + s + " " + f);
	}
}

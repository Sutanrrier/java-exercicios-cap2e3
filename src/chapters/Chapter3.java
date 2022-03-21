package chapters;

public class Chapter3 {
	
	public void question1() {
		for(int i=150; i<=300; i++) {
			System.out.println(i);
		}
	}
	public void question2() {
		int soma = 0;
		for(int i=1; i<=1000; i++) {
			soma += i;
		}
		System.out.println("Soma de 1 a 1000 = " + soma);
	}
	public void question3() {
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	public void question4() {
		int fatorial = 1;
		for(int i=1; i<=10; i++) {
			fatorial = fatorial * i;
			System.out.println("Fatorial de " + i + "! = " + fatorial);
		}
	}
	public void question5() {
		long fatorial = 1;
		System.out.println("Fatorial de 1 a 20");
		for(int i=1; i<=20; i++) {
			fatorial = fatorial * i;
			System.out.println("Fatorial de " + i + "! = " + fatorial);
		}
		
		System.out.println("\nFatorial de 1 a 30");
		fatorial = 1;
		for(int i=1; i<=30; i++) {
			fatorial = fatorial * i;
			System.out.println("Fatorial de " + i + "! = " + fatorial);
		}
		
		System.out.println("\nFatorial de 1 a 40");
		fatorial = 1;
		for(int i=1; i<=40; i++) {
			fatorial = fatorial * i;
			System.out.println("Fatorial de " + i + "! = " + fatorial);
		}
	}
	public void question6() {
		final int LIMIT = 100;
		int n1 = 0, n2 = 1;
		System.out.println("Sequência de Fibonnaci de 0 até passar " + LIMIT);
		System.out.print(n1 + " " + n2);
		while(n2 <= LIMIT || n1 <= LIMIT) {
			n1 += n2;
			if (n1 <= LIMIT) {
				n2 += n1;
			}
			else {
				System.out.println(" " + n1);
				break;
			}
			System.out.print(" " + n1 + " " + n2);
		}
	}
	public void question7() {
		int x = 13;
		System.out.println("Caminho do número " + x + " até se tornar 1:");
		while(x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
			}
			else {
				x = (3 * x) + 1;
			}
			System.out.print(x + " ");
		}
	}
	public void question8() {
		final int TAMANHO_ESCADA = 5; 
		for(int i=1; i<=TAMANHO_ESCADA; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j * i+ " ");
			}
			System.out.println();
		}
	}
	public void question9() {
		int n1 = 0, n2 = 1;
		System.out.println("Sequência de Fibonnaci usando apenas 2 variáveis");
		System.out.print(n1 + " " + n2);
		while(n2 <= 100 || n1 <= 100) {
			n1 += n2;
			if (n1 <= 100) {
				n2 += n1;
			}
			else {
				System.out.println(" " + n1);
				break;
			}
			System.out.print(" " + n1 + " " + n2);
		}
	}
	
}

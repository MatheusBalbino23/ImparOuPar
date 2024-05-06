

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		String posicao = "";
		String parOuImpar = "";
		
		if(num >= 0 && num <= 10) {
			posicao = "está entre 0 a 10";
		}else
			posicao = "não está entre 0 a 10";
		
		if(num % 2 == 0) {
			parOuImpar = "é par";
		}else
			parOuImpar = "é ímpar";
		
		System.out.println("O número digitado " + posicao);
		System.out.println("O número digitado " + parOuImpar);

		entrada.close();
	}
}

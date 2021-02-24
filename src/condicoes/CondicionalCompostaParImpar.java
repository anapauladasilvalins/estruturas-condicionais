package condicoes;

import java.util.Scanner;

public class CondicionalCompostaParImpar {
	public static void main(String [] args) {
		int num = 0;
		System.out.println("Digite um número:");
		Scanner n = new Scanner(System.in);
		num = n.nextInt(); 
		
		
		if (num % 2 == 0) {
			System.out.println("NÚMERO PAR");
			
		} else {
			System.out.println("NÚMERO ÍMPAR");
		}
	}

}

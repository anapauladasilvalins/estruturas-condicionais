package condicoes;

import java.util.Scanner;

public class CondicionalCompostaParImpar {
	public static void main(String [] args) {
		int num = 0;
		System.out.println("Digite um n�mero:");
		Scanner n = new Scanner(System.in);
		num = n.nextInt(); 
		
		
		if (num % 2 == 0) {
			System.out.println("N�MERO PAR");
			
		} else {
			System.out.println("N�MERO �MPAR");
		}
	}

}

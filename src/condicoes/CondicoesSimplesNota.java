package condicoes;

import java.util.Scanner;

public class CondicoesSimplesNota {
	public static void main(String [] args) {
		
		Scanner nota = new Scanner(System.in);
		
		System.out.println("DIGITE A PRIMEIRA NOTA:");
		float n1 = nota.nextFloat();
		
		System.out.println("DIGITE A SEGUNDA NOTA:");
		float n2 = nota.nextFloat();
		float m = (n1 + n2) / 2;
		System.out.println("SUA M�DIA FOI: " + m);
		
		if(m >= 7) // estrutura de controle, condi��o simples
			System.out.println("PARAB�NS, VOC� FOI APROVADO!");
		/*else  // condi��o composta
			System.out.println("ESTUDE MAIS.");
			*/
		
	}

}

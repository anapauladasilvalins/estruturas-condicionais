package condicoes;

import java.util.Scanner;

public class CondicoesCompostasIdade {
	public static void main(String [] args) {
		
		Scanner ano = new Scanner(System.in); 
		System.out.println("Informe o ano de nascimento:");
		int nascimento = ano.nextInt();
		int idade = 2020 - nascimento;
		System.out.println("Sua idade é " + idade + " anos");
		
		if(idade >= 18) {
			System.out.println("Maior de idade");
			
			} else {
				System.out.println("Menor de idade");
				
		}
	}

}

package condicoes;

import java.util.Scanner;

public class CondicoesCompostasEncadeadasVoto {
	public static void mai(String[] args) {
	Scanner voto = new Scanner(System.in); 
	int idade;
	System.out.println("Informe a idade:");
	idade = voto.nextInt();
	
	if (idade < 16) {
		System.out.println("NÃO VOTA.");
		
	} else if (idade >=16 && idade < 18 || idade > 70) { // else if tornam-se encadeados em um só bloco.
		System.out.println("VOTO OPCIONAL.");
	} else {
		System.out.println("VOTO OBRIGATÓRIO.");
	}

	}
}
package condicoes;

import java.util.Scanner;

public class CondicaoCompostaAninhadaTriangulo {
	public static void main(String [] args) {
		
		int a = 0, b = 0, c = 0;
		
		Scanner triangulo = new Scanner(System.in);
		
		System.out.println("Informe o valor de a:");
		a = triangulo.nextInt();
		
		System.out.println("Informe o valor de b:");
		b = triangulo.nextInt();
		
		System.out.println("Informe o valor de c:");
		c = triangulo.nextInt();
		
		System.out.print("Este é um triangulo ");
		if (a == b && b == c && c == a) {
			System.out.println(" EQUILATERO");
		}
		else if(b == a && b != c && c != a) {
				
				System.out.println("ISOSCELES");
			
		}
		else if(a != b && b!= c && c != a) { 
			
			 System.out.println("ESCALENO");
			
		}
		
		
	}

}

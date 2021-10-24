package br.com.JhonathanDarly.git;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float numero1, numero2;
		
		System.out.println("==============================");
		System.out.println("      Números múltiplos    ");
		System.out.println("==============================");
		
		System.out.println("Por favor informe o 1ª numero:");
		numero1 = sc.nextFloat();
		System.out.println("Por favor informe o 2ª numero:");
		numero2 = sc.nextFloat();
		
		
		if (numero1 % numero2 == 0) {
			System.out.println("Esses números são multiplos!");
		}else {
			System.out.println("Esses números não são multiplos!");
		}
	
	
		sc.close();

		
	}
}

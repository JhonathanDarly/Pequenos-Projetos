package br.com.JhonathanDarly.git;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float numero1, numero2;
		
		System.out.println("==============================");
		System.out.println("      N�meros m�ltiplos    ");
		System.out.println("==============================");
		
		System.out.println("Por favor informe o 1� numero:");
		numero1 = sc.nextFloat();
		System.out.println("Por favor informe o 2� numero:");
		numero2 = sc.nextFloat();
		
		
		if (numero1 % numero2 == 0) {
			System.out.println("Esses n�meros s�o multiplos!");
		}else {
			System.out.println("Esses n�meros n�o s�o multiplos!");
		}
	
	
		sc.close();

		
	}
}

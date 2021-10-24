package br.com.JhonathanDarly.git;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float temperatura1,temperatura2, convertida;

		System.out.println("Por gentileza digite uma temperatura em celsios: ");
		temperatura1 = sc.nextInt();
		
		temperatura2 = (temperatura1 / 5);
		convertida = (temperatura2 * 9) + 32;
		
		System.out.printf("A temperatura %.2f °c é igual a %.2f°f " ,temperatura1,convertida);		

		
		sc.close();

		

	}

}

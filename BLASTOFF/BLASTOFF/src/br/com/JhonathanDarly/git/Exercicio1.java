package br.com.JhonathanDarly.git;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idadeI, idadeJ, idadeK, idadeX, idadeY, mediaIdade;

		System.out.printf("Digite a 1ª idade: ");
		idadeI = sc.nextInt();
		System.out.printf("Digite a 2ª idade: ");
		idadeJ = sc.nextInt();
		System.out.printf("Digite a 3ª idade: ");
		idadeK = sc.nextInt();
		System.out.printf("Digite a 4ª idade: ");
		idadeX = sc.nextInt();
		System.out.printf("Digite a 5ª idade: ");
		idadeY = sc.nextInt();
		mediaIdade = (idadeI + idadeJ + idadeK + idadeX + idadeY) / 5;
		System.out.printf("A média das idades é: " + mediaIdade);

		sc.close();
	}

}

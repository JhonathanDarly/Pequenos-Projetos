package br.com.JhonathanDarly.git;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idadeI, idadeJ, idadeK, idadeX, idadeY, mediaIdade;

		System.out.printf("Digite a 1� idade: ");
		idadeI = sc.nextInt();
		System.out.printf("Digite a 2� idade: ");
		idadeJ = sc.nextInt();
		System.out.printf("Digite a 3� idade: ");
		idadeK = sc.nextInt();
		System.out.printf("Digite a 4� idade: ");
		idadeX = sc.nextInt();
		System.out.printf("Digite a 5� idade: ");
		idadeY = sc.nextInt();
		mediaIdade = (idadeI + idadeJ + idadeK + idadeX + idadeY) / 5;
		System.out.printf("A m�dia das idades �: " + mediaIdade);

		sc.close();
	}

}

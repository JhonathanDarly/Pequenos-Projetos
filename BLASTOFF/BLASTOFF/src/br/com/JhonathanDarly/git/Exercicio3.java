package br.com.JhonathanDarly.git;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, menor;

		System.out.println("Por gentileza digite o um numero inteiro qualquer: ");
		num1 = sc.nextInt();
		System.out.println("Por gentileza digite outro numero inteiro qualquer: ");
		num2 = sc.nextInt();
		System.out.println("Digite o ultimo numero inteiro qualquer: ");
		num3 = sc.nextInt();

		if (num1 < num2) {
			menor = num1;
		} else if (num2 < num3) {
			menor = num2;
		} else {
			menor = num3;
		}

		System.out.println("O menor valor digitado é: " + menor);

		sc.close();

	}

}

package br.com.JhonathanDarly.git;


import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double km, consumo, media;
		
		System.out.println("Por gentileza informe quantos KM você percorreu?");		
		km = sc.nextDouble();
		System.out.println("Por gentileza agora informe quantos Litros de combustivel você utilizou?");		
		consumo = sc.nextDouble();	
		media = km/consumo;
		System.out.printf("Seu consumo médio de comubustivel foi %.2f km por litro!  ",media);
		

		sc.close();
	}

}

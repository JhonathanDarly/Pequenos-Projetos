package br.com.JhonathanDarly.git;


import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double km, consumo, media;
		
		System.out.println("Por gentileza informe quantos KM voc� percorreu?");		
		km = sc.nextDouble();
		System.out.println("Por gentileza agora informe quantos Litros de combustivel voc� utilizou?");		
		consumo = sc.nextDouble();	
		media = km/consumo;
		System.out.printf("Seu consumo m�dio de comubustivel foi %.2f km por litro!  ",media);
		

		sc.close();
	}

}

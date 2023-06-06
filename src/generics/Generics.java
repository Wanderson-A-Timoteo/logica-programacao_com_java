package generics;

import java.util.Scanner;

public class Generics {

	public static void main(String[] args) {
		
		/* Deseja-se fazer um programa que leia uma quantidade N, e depois N números inteiros.
		   Ao final, imprima esses números de forma organizada conforme exemplo. 
		   Em seguida, informar qual foi o primeiro valor informado.
		   
		   Exemplo:		 
			Quantos valores serão informados? 3
			10
			8
			23
			[10, 87, 23]
			Primeiro número: 10
				
		*/
		
		Scanner scan = new Scanner(System.in);
		
		PrintService<Integer> printService = new PrintService<>();
		
		System.out.print("Quantos valores serão informados?");
		
		int numero = scan.nextInt();
		
		for (int i = 0; i < numero; i++) {
			Integer valor =  scan.nextInt();
			printService.adicionarValor(valor);
		}
		
		printService.imprimirValores();
		System.out.println("Primeiro Elemento da Lista: " + printService.primeiroElemento());
		
		scan.close();

	}

}

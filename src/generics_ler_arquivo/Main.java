package generics_ler_arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	/*
	 * Fazer um programa que leia um conjunto de números a partir de um 
	 * arquivo e depois mostre o maior dentre eles, conforme exemplo.
	 * 
	 * Exemplo arquivo numeros.txt:
	 * 10
	 * 13
	 * 15
	 * 8
	 * 3
	 * 
	 * Maior: 15
	 * */ 
		
		List<Integer> lista = new ArrayList<>();
		
		String path = "/home/wanderson/Projetos/ws-eclipse/logica_programacao_com_java/src/generics_ler_arquivo/numeros.txt";
		
		try (BufferedReader lerBuffer = new BufferedReader(new FileReader(path))) {
			
			String linha = lerBuffer.readLine();
			
			while (linha != null) {
				lista.add(Integer.parseInt(linha));
				linha = lerBuffer.readLine();
				
			}
			
			Integer valor = CalculoService.maior(lista);
			System.out.println("Maior: ");
			System.out.println(valor);
		} catch (Exception e) {

			System.out.println("Erro: " + e.getMessage());
		}

	}

}

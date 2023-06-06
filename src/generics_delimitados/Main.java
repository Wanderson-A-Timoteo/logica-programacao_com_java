package generics_delimitados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		/*
		 * 
		 * Uma empresa de consultoria deseja avaliar a performance de produtos,
		 * funcionários, dentre outras coisas. Um dos cálculos que ela
		 * precisa é encontrar o maior dentre um conjunto de elementos.
		 * Fazer um programa que leia um conjunto de produtos a partir de um 
		 * arquivo, conforme exemplo, e depois mostre o mais caro deles.
		 * 
		 * Exemplo:
		 * Computador, 890.50
		 * Iphone X, 910.00
		 * Tablet, 550.00
		 * Mais caro:
		 * Iphone X, 910.00 
		 * 
		 * */ 
		
		Locale.setDefault(Locale.US);
		
		List<Produto> lista = new ArrayList<>();
		
		String path = "/home/wanderson/Projetos/ws-eclipse/logica_programacao_com_java/src/generics_delimitados/produtos.txt";
		
		try (BufferedReader lerBuffer = new BufferedReader(new FileReader(path))) {
			
			String linha = lerBuffer.readLine();
			
			while (linha != null) {
				String[] campos = linha.split(",");
				lista.add(new Produto(campos[0], Double.parseDouble(campos[1])));
				linha = lerBuffer.readLine();				
			}
			
			Produto valor = CalculoService.maisCaro(lista);
			System.out.println("Mais caro: ");
			System.out.println(valor);
		} catch (Exception erro) {

			System.out.println("Erro: " + erro.getMessage());
		}

	}

}

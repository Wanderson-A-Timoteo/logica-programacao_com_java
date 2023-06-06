package generics_de_tipo_curinga;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/* 
		 * Fazer um programa que recebe duas lista, uma de tipo Integer e outra de tipo String 
		 * e imprima as duas lista.
		 */ 

		List<Integer> listaInteiros = Arrays.asList(5, 2, 10, 15);
		imprimirLista(listaInteiros);
		
		List<String> listaNomes = Arrays.asList("Wanderson", "Ryan", "Jeane", "Rose");
		imprimirLista(listaNomes);
	}
	
	/* 
	 * A Interrogação significa que ela é uma lista curinga que aceita qualquer tipo de lista
	 * podendo ser Integer, String ou duas listas sendo uma de Integer e outra de Strings, 
	 * como neste exemplo a cima, estamos passando duas lista de tipos diferentes, e o resultado
	 * é a impressão das duas lista.
	 * Porém não é possível adicionar um novo elemento a coleção coringa.
	 */ 
	public static void imprimirLista(List<?> listas) {
		//lista.add(3); Não é possível
		for (Object objeto : listas) {
			System.out.println(objeto);
		}
	}
}

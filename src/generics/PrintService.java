package generics;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	List<T> lista = new ArrayList<>();
	
	public void adicionarValor(T valor) {
		lista.add(valor);
	}
	
	public T primeiroElemento() {
		if (lista.isEmpty()) {
			throw new IllegalStateException("A lista esta vazia"); 
		}
		return lista.get(0);
	}
	
	public void imprimirValores() {
		System.out.print("Lista informada [");
		if (!lista.isEmpty()) {
			System.out.print(lista.get(0));
		}
		for (int i = 1; i < lista.size(); i++) {
			System.out.print(", " + lista.get(i));
		}

		System.out.println("]");
	}
}

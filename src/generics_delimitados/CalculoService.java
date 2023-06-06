package generics_delimitados;

import java.util.List;

public class CalculoService {

	public static <T extends Comparable<T>> T maisCaro(List<T> lista) {
		if (lista.isEmpty()) {
			throw new IllegalStateException("A lista não pode estar vazia");			
		}
		T maisCaro = lista.get(0);
		for (T item : lista) {
			if (item.compareTo(maisCaro) > 0) {
				maisCaro = item;
			}
		}
		return maisCaro;
	}
}

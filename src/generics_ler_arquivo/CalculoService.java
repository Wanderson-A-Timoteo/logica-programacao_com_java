package generics_ler_arquivo;

import java.util.List;

public class CalculoService {

	public static Integer maior(List<Integer> lista) {
		if (lista.isEmpty()) {
			throw new IllegalStateException("A lista não pode estar vazia");			
		}
		Integer maior = lista.get(0);
		for (Integer item : lista) {
			if (item.compareTo(maior) > 0) {
				maior = item;
			}
		}
		return maior;
	}
}

import java.util.ArrayList;
import java.util.List;

public class OperandoNumeros {

	/**
	 * Retorna valores presente no intevalo especificado, seja crescente ou decrescente
	 * @param inicio
	 * @param fim
	 * @return List<Integer>
	 */
	public static List<Integer> geraValoresIntervalo(Integer inicio, Integer fim) {
		if(inicio < fim) {
			return geraValoresIntervaloCrescente(inicio, fim);
		} else {
			return geraValoresIntervaloDecrescente(inicio, fim);
		}
	}
	
	public static List<Integer> geraValoresIntervaloCrescente(Integer inicio, Integer fim) {
		List<Integer> resultado = new ArrayList<Integer>();
		try {
			while(inicio <= fim) {
				resultado.add(inicio);
				//System.out.print(inicio + " ");
				inicio++;
			}
		} catch(NullPointerException e) {
			e.getMessage();
			System.out.println("Nâo passar valores nulos");
		}
		return resultado;
	}
	
	public static List<Integer> geraValoresIntervaloDecrescente(Integer inicio, Integer fim) {
		List<Integer> resultado = new ArrayList<Integer>();
		try {
			while(inicio >= fim) {
				resultado.add(inicio);
				//System.out.print(inicio + " ");
				inicio--;
			}
		} catch(NullPointerException e) {
			e.getMessage();
			System.out.println("Nâo passar valores nulos");
		}
		return resultado;
	}
	
	public static List<Integer> gerValoresEntreIncioEFim(Integer inicio, Integer fim) {
		List<Integer> resultado = new ArrayList<Integer>();
		try {
			inicio++;
			while(inicio < fim) {
				//System.out.print(inicio + " ");
				inicio++;
			}
		} catch(NullPointerException e) {
			e.getMessage();
			System.out.println("Nâo passar valores nulos");
		}
		return resultado;
	}
	
	public static void geraUniaoDoisIntervalos(Integer inicio, Integer fim, Integer inicio1, Integer fim1) {
		try {
			List<Integer> lista = geraValoresIntervalo(inicio, fim);
			List<Integer> lista1 = geraValoresIntervalo(inicio1, fim1);
			lista1.forEach(valor -> {
				if(!lista.contains(valor)) {
					lista.add(valor); 	
				}
			});
			lista.forEach(valor -> System.out.println(valor));
		} catch(NullPointerException e) {
			e.getMessage();
			System.out.println("Nâo passar valores nulos");
		}
	}
	
	public static List<Integer> geraInterseccaoDoisIntervalos(Integer inicio, Integer fim, Integer inicio1, Integer fim1) {
		List<Integer> resultado = new ArrayList<Integer>();
		try {
			List<Integer> lista = geraValoresIntervalo(inicio, fim);
			List<Integer> lista1 = geraValoresIntervalo(inicio1, fim1);
			lista1.forEach(valor -> {
				if(lista.contains(valor)) {
					resultado.add(valor); 	
				}
			});
			resultado.forEach(valor -> System.out.println(valor));
		} catch(NullPointerException e) {
			e.getMessage();
			System.out.println("Nâo passar valores nulos");
		}
		return resultado;
	}
}

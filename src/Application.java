
import org.rosuda.JRI.*;

public class Application {

	public static void main(String[] args) {
		//OperandoNumeros.imprimeIntervalo(3, 5);
		//OperandoNumeros.imprimeIntervaloEntreIncioEFim(null, 7);
		//OperandoNumeros.geraInterseccaoDoisIntervalos(5, 7, 9, 6);
		Matriz matriz =  OperandoMatriz.criaMatriz(2, 2);
		OperandoMatriz.carregaPosicoes(1, matriz);
		System.out.println(matriz.valorPosicao(0, 0));
	}
	
}

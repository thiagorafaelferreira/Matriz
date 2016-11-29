
public class OperandoMatriz {

	/**
	 * Cria matriz passando número de linhas e colunas em tipo integer
	 * @param linha
	 * @param coluna
	 * @return
	 */
	public static Matriz criaMatriz(Integer linha , Integer coluna) {
		 Matriz matriz = new Matriz();
		 matriz.setMatriz(new Integer[linha][coluna]);
		 matriz.setLinha(linha);
		 matriz.setColuna(coluna);
		 return matriz;
	}
	
	/**
	 * Cria matriz passando npumero de linahs e colunas em tipo string
	 * @param linha
	 * @param coluna
	 * @return
	 */
	public static Matriz criaMatriz(String linha , String coluna) {
		 Matriz matriz = new Matriz();
		 Integer linhaInt = Integer.parseInt(linha);
		 Integer colunaInt = Integer.parseInt(coluna);
		 matriz.setMatriz(new String[linhaInt][colunaInt]);
		 matriz.setLinha(linhaInt);
		 matriz.setColuna(colunaInt);
		 return matriz;
	}
	
	public static Matriz criaMatriz(Integer valor, Integer linha , Integer coluna) {
		Matriz matriz = criaMatriz(linha, coluna); 
		carregaPosicoes(valor, matriz);
		return matriz;
	}
	
	public static Matriz criaMatriz(String valor, String linha , String coluna) {
		Matriz matriz = criaMatriz(linha, coluna); 
		carregaPosicoes(valor, matriz);
		return matriz;
	}
	
	public static Matriz carregaPosicoes(Integer valor, Matriz matriz) {
		Integer linha = 0;
		Integer coluna = 0;
		Integer[][] matrizPreenchida = (Integer[][])matriz.getMatriz();
		while(linha < matriz.getLinha()) {
			coluna = 0;
			while(coluna < matriz.getColuna()) {
				matrizPreenchida[linha][coluna] = valor;
				coluna++;
			}
			linha++;
		}
		return matriz;
	}
	
	public static void carregaPosicoes(String valor, Matriz matriz) {
		Integer linha = 0;
		Integer coluna = 0;
		String[][] matrizPreenchida = (String[][])matriz.getMatriz();
		while(linha < matriz.getLinha()) {
			coluna = 0;
			while(coluna < matriz.getColuna()) {
				matrizPreenchida[linha][coluna] = valor;
				coluna++;
			}
			linha++;
		}
	}
	
}

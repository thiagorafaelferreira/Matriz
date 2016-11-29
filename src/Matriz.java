
public class Matriz {

	Object[][] matriz;
	Integer linha;
	Integer coluna;
	Integer valor;
	
	public Object[][] getMatriz() {
		return matriz;
	}
	public void setMatriz(Object[][] matriz) {
		this.matriz = matriz;
	}
	public Integer getLinha() {
		return linha;
	}
	public void setLinha(Integer linha) {
		this.linha = linha;
	}
	public Integer getColuna() {
		return coluna;
	}
	public void setColuna(Integer coluna) {
		this.coluna = coluna;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public String getSize() {
		if(linha !=null && coluna != null) {
			return linha + " " + coluna;
		}
		return ""; 
	}
	public Integer valorPosicao(Integer lin, Integer col) {
		if(this.linha != null && this.coluna != null ) {
			if(((lin - 1) <= linha) && ((col - 1) <= coluna)) {
				return (Integer) matriz[lin][col];
			}
		}
		return null;
	}
	
	
}

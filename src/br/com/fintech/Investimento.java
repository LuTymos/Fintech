package br.com.fintech;

public class Investimento extends Conta{
	private static final long serialVersionUID = 1L;
	
	private float valor;
	private String codigo;
	
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	

}

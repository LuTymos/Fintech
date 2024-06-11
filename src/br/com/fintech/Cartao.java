package br.com.fintech;

import java.sql.Date;

public class Cartao extends Conta{
	private static final long serialVersionUID = 1L;
	
	private Date dtVencimento;
	private Date dt_fechamento;
	private float fatura;
	private float limite;
	 public Date getDtVencimento() {
		return dtVencimento;
	}
	public void setDtVencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}
	public Date getDt_fechamento() {
		return dt_fechamento;
	}
	public void setDt_fechamento(Date dt_fechamento) {
		this.dt_fechamento = dt_fechamento;
	}
	public float getFatura() {
		return fatura;
	}
	public void setFatura(float fatura) {
		this.fatura = fatura;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	
	

}

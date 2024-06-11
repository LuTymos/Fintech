package br.com.fintech;

import java.sql.Date;

public class DespesaCartao extends Transacao {

	private static final long serialVersionUID = 1L;
    private float valor;
    private boolean status;
    private int qntParcela;

    public DespesaCartao() {
    }

    public DespesaCartao(int id_transacao, Date Dt_transacao, String detalhe, float valor, boolean status, int qntParcela) {
        super(id_transacao, Dt_transacao, detalhe);
        this.valor = valor;
        this.status = status;
        this.qntParcela = qntParcela;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getQntParcela() {
        return qntParcela;
    }

    public void setQntParcela(int qntParcela) {
        this.qntParcela = qntParcela;
    }
}

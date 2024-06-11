package br.com.fintech;

import java.sql.Date;

public class Despesa extends Transacao {

	private static final long serialVersionUID = 1L;
    private float valor;
    private boolean status;


    public Despesa() {
    }

    public Despesa(int id_transacao, Date Dt_transacao, String detalhe, float valor, boolean status) {
        super(id_transacao, Dt_transacao, detalhe);
        this.valor = valor;
        this.status = status;
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
}

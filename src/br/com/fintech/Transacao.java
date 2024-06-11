package br.com.fintech;

import java.io.Serializable;
import java.sql.Date;

public class Transacao implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id_transacao;
    private Date Dt_transacao;
    private String detalhe;


    public Transacao() {
    }


    public Transacao(int id_transacao, Date Dt_transacao, String detalhe) {
        this.id_transacao = id_transacao;
        this.Dt_transacao = Dt_transacao;
        this.detalhe = detalhe;
    }

    public int getId_transacao() {
        return id_transacao;
    }

    public void setId_transacao(int id_transacao) {
        this.id_transacao = id_transacao;
    }

    public Date getDt_transacao() {
        return Dt_transacao;
    }

    public void setDt_transacao(Date dt_transacao) {
        Dt_transacao = dt_transacao;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }


}

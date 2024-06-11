package br.com.fintech;

import java.io.Serializable;

public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id_conta;
    private String nome;
    private String descricao;

    public Conta() {
    }

    public Conta(int id_conta, String nome, String descricao) {
        this.id_conta = id_conta;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId_conta() {
        return id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void cadastrarConta(Conta conta) {
        // Implementação do método
    }

    public void atualizarConta(Conta conta) {
        // Implementação do método
    }

    public void consultarConta(int id) {
        // Implementação do método
    }
}

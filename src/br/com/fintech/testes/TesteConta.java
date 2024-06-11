package br.com.fintech.testes;

import java.util.List;

import br.com.fintech.Conta;
import br.com.fintech.dao.ContaDAO;

public class TesteConta {

	public static void main(String[] args) {

	      ContaDAO dao = new ContaDAO();
	  
	      Conta contaC6 = new Conta();
	      contaC6.setNome("C6");
	      contaC6.setDescricao("Conta principal");

	      Conta contaInter = new Conta();
	      contaC6.setNome("Inter");
	      contaC6.setDescricao("Conta Inter");
	      
	      Conta contaItau = new Conta();
	      contaC6.setNome("Itau");
	      contaC6.setDescricao("Conta Itau");
	      
	      Conta contaNubank = new Conta();
	      contaC6.setNome("contaNubank");
	      contaC6.setDescricao("Conta Nubank");
	      
	      Conta contaXP = new Conta();
	      contaC6.setNome("XP");
	      contaC6.setDescricao("Conta XP");
	      
	      dao.cadastrar(contaC6, 1);
	      dao.cadastrar(contaInter, 2);
	      dao.cadastrar(contaItau, 3);
	      dao.cadastrar(contaNubank, 4);
	      dao.cadastrar(contaXP, 5);
	      
	      
	      
	  
	      System.out.println("Cadastrado!");
	      
	      
	      List<Conta> lista = dao.getAll();
	      for (Conta item : lista) {
	        System.out.println(item.getId_conta() + " " + item.getNome() + " " + item.getDescricao() );
	      }
	    }
	
}

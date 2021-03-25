package br.gov.sefaz.model;
	
public class Conta {
	    int numero;
	    double saldo;
	    double limite;

	    void depositar(double valor){
	        this.saldo += valor;
	    }

	    void sacar(double valor){
	        this.saldo -= valor;
	    }

	    void imprimeExtrato(){
	        System.out.println("Saldo: "+this.saldo);
	    }
}

package application;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.depositar(100);
		cp.depositar(20);
		
		System.out.println("Movimentações iniciais:");
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cc.transferir(50, cp);
		cp.transferir(20, cc);
		
		System.out.println("Novas movimentações");
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class AbrirConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o número da conta: ");
		int nrConta = sc.nextInt();
		System.out.print("Informe o cliente: ");
		sc.nextLine();
		String nmCliente = sc.nextLine();
		String depIni = "";
		
		while (!depIni.toUpperCase().equals("S") && !depIni.toUpperCase().equals("N")) {
			System.out.print("Haverá depósito inicial (s/n)? ");
			depIni = sc.next();
		};
		
		double vlDepIni = 0.00;
		Conta contaCli;
		
		if (depIni.toUpperCase().equals("S")) {
			System.out.println("Informe o depósito inicial: ");
			vlDepIni = sc.nextDouble();				
			contaCli = new Conta(nrConta, nmCliente, vlDepIni);
		}
		else {
			contaCli = new Conta(nrConta, nmCliente);
		}
		
		System.out.println("Dados da conta: ");
		System.out.println(contaCli.toString());
		
		System.out.print("Informe o valor do depósito: ");
		double deposito = sc.nextDouble();
		
		contaCli.depositar(deposito);
		
		System.out.println("Dados atualizados da conta:");
		System.out.println(contaCli.toString());

		System.out.print("Informe o valor do saque: ");
		double saque = sc.nextDouble();
		
		contaCli.sacar(saque);
		
		System.out.println("Dados atualizados da conta:");
		System.out.println(contaCli.toString());



		sc.close();
	}

}

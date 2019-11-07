package entities;

public class Conta {
	
	private int nrConta;
	private String nmCliente;
	private double vlSaldo;
	
	public Conta(int nrConta, String nmCliente, double depInicial) {
		this.nrConta = nrConta;
		this.nmCliente = nmCliente;
		depositar(depInicial);
	}

	public Conta(int nrConta, String nmCliente) {
		this.nrConta = nrConta;
		this.nmCliente = nmCliente;
	}

	public String toString() {
		return "Conta "
				+ nrConta
				+ ", Cliente: "
				+ nmCliente
				+ ", Saldo $ "
				+ String.format("%.2f", vlSaldo);

	}

	public int getNrConta() {
		return nrConta;
	}
	
	public String getNmCliente() {
		return nmCliente;
	}

	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}

	public double getVlSaldo() {
		return vlSaldo;
	}
	
	public void depositar(double valor) {
		this.vlSaldo += valor;
	}
	
	public void sacar(double valor) {
		this.vlSaldo -= (valor + 5);
	}



}

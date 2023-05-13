package pooContaBancaria;

import java.util.Objects;

public class ContaPoupanca implements Iconta{

	String titular;
	int numConta;
	String endereço;
	double saldo;
	
	
	
	public ContaPoupanca(String titular, int numConta, String endereço, double saldo) {
		this.titular = titular;
		this.numConta = numConta;
		this.endereço = endereço;
		this.saldo = saldo;
	}
	
	@Override
	public void sacar(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
		}
	}
	@Override
	public double GetSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}
	@Override
	public void SetDeposito(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
	}
	@Override
	public void transferir(Iconta conta, double valor) {
		// TODO Auto-generated method stub
		double taxa = valor*0.03;
		if(conta instanceof ContaPoupanca) {
			if(conta.GetSaldo() < valor) {
				System.out.println("Seu saldo é insuficiente!");
			}
			else {
				System.out.println("Transferência realizada!");
				sacar(valor);
				conta.SetDeposito(valor);
			}
		}
		else {
			if(conta.GetSaldo() < valor+taxa) {
				System.out.println("Seu saldo é insuficiente!");
			}
			else {
				System.out.println("Transferência realizada!");
				sacar(valor+taxa);
				conta.SetDeposito(valor);
			}
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(numConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaPoupanca other = (ContaPoupanca) obj;
		return numConta == other.numConta;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [titular=" + titular + ", numConta=" + numConta + ", endereço=" + endereço + ", saldo="
				+ saldo + "]";
	}
	
	
	

}

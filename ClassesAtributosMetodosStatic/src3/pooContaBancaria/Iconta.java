package pooContaBancaria;

public interface Iconta {

	void sacar(double valor);
	double GetSaldo();
	void SetDeposito(double valor);
	void transferir(Iconta conta, double valor);
	
}

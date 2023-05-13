package pooContaBancaria;

public class main {

	public static void main(String[] args) {
	

		Iconta contaPoupanca = new ContaPoupanca("Fábio", 123, "Buíque", 1200);
		Iconta contaCorrente = new ContaCorrente("Gustavo", 145, "Belo Jardim", 1500);
		
		System.out.println(contaCorrente);
		System.out.println();
		System.out.println(contaPoupanca);
		
		contaCorrente.sacar(500);
		
		System.out.println(contaCorrente);
		
		contaCorrente.transferir(contaPoupanca, 500);
	
		System.out.println();
		System.out.println(contaPoupanca);
		System.out.println();
		System.out.println(contaCorrente);
	}

}

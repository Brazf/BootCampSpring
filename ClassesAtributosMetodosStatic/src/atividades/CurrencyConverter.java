package atividades;

public class CurrencyConverter {

	public double dollarValue;
	public double dollarBuy;
	
	public CurrencyConverter (double dollarValue, double dollarBuy) {
		
		this.dollarValue = dollarValue;
		this.dollarBuy = dollarBuy;
		
	}
	
	public double Convercao () {
		
		double dolares = this.dollarValue*this.dollarBuy;
		return dolares + (dolares*0.06);
	}
	
	public String toString () {
		return "Valor a ser pago em reais = " + String.format("%.2f", Convercao());
	}
}

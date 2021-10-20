package entities;

public class CurrencyConverter {

	private double dollarValue;
	private int dollarQuantity;
	
	public void setDollarValue(double dolar) {
		this.dollarValue = dolar;
	}
	public double getDollarValue () {
		return this.dollarValue;
	}
	
	public void setDollarQuantity(int quantidade) {
		this.dollarQuantity = quantidade;
	}
	public int getDollarQuantity () {
		return this.dollarQuantity;
	}
	public double calculaTotal () {
		return (dollarValue * dollarQuantity) + (0.06 * (dollarValue * dollarQuantity));
	}

	
	
}

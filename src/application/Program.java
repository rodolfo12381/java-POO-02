package application;

import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		CurrencyConverter c = new CurrencyConverter();
		System.out.println("What is the dollar price?");
		c.setDollarValue(sc.nextDouble());
		System.out.println("Dollar price: "+String.format("%.2f", c.getDollarValue()));
		
		System.out.println("How many dollars will be bought? ");
		c.setDollarQuantity(sc.nextInt());
		System.out.println("Total dollars: "+c.getDollarQuantity());
		System.out.println("Amount to be paid in reais = "+String.format("%.2f", c.calculaTotal()));
	}

}

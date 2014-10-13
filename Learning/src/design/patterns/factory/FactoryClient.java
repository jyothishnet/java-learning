package design.patterns.factory;

public class FactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency rupee = CurrencyFactory.createCurrency("india");
		System.out.println(rupee.getSymbol());
	}

}

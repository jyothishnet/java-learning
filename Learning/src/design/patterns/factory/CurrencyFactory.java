package design.patterns.factory;

public class CurrencyFactory {
	
	public static Currency createCurrency(String country) {
		
		if(country.equalsIgnoreCase("India")) {
			return new Rupee();
		}
		else if(country.equalsIgnoreCase("US")||country.equalsIgnoreCase("Australia")) {
			return new Dollar();
		}
		else if(country.equalsIgnoreCase("DENMARK")) {
			return new Euro();
		}
		else {
			return new Dollar();
		}
			
	}

}

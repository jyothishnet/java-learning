package design.patterns.decorator;

public class TestClient {

	public static void main(String[] args) {
	
		 Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
		 System.out.println(icecream.makeIcecream());
		 Icecream icecream2 = new HoneyDecorator(new SimpleIcecream());
		 System.out.println(icecream2.makeIcecream());
	}

}

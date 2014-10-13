package design.patterns.decorator;

public class NuttyDecorator extends IcecreamDecorator {

	public NuttyDecorator(Icecream specialIcecream) {
		super(specialIcecream);
		
	}
	
	public String makeIcecream() {
		
		return specialIcecream.makeIcecream() + " >Nutty ";
	}

}

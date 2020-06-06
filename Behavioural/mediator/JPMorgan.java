package Behavioural.mediator;

public class JPMorgan extends Colleague{

	JPMorgan(Mediator newMediator) {
		super(newMediator);
		System.out.println("JPMorgan signed up for Exchange !!!");
	}

}

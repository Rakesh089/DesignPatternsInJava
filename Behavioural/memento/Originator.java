package Behavioural.memento;

public class Originator {

	private String state="";

	public String getState() {
		return state;
	}

	public void setState(String newState) {
		this.state = this.state + " " + newState;
	}
	
	public Memento saveMemento() {
		System.out.println("Saving state to Memento : " + state);
		return new Memento(this.state);
	}
	
	public void restoreMemento(Memento memento) {
		System.out.println("Restoring state to : " + state);
		state = memento.getState(); 
	}
}

package Behavioural.memento;

public class Memento {
	
	private String state;

	Memento(String newState){
		state = newState;
	}	
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}

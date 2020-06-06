package Behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	
	List<Memento> savedStates = new ArrayList<Memento>();
	private static int totalStates = -1, curState = -1 ;
	
	public void saveState(Memento memento) {
		totalStates++;
		curState++;
		savedStates.add(memento);
	}
	
	public Memento getMemento(int index) {
		return savedStates.get(index);
	}
	
	public String undo() {
		if(curState > 0) {
			return savedStates.get(--curState).getState();
		}
			return "NA";
		
	}
	
	public String redo() {
		return curState<=totalStates ? savedStates.get(curState++).getState() : "NA";
	}
	
	public String getCurrentState() {
		return savedStates.get(curState).getState();
	}
}

package Behavioural.memento;

public class TestPatter {

	public static void main(String[] args) {
				
		Caretaker ct = new Caretaker();
		
		Originator s = new Originator();
		
		s.setState("I");
		ct.saveState(s.saveMemento());
		
		s.setState("am");
		ct.saveState(s.saveMemento());
		
		s.setState("Happy");
		ct.saveState(s.saveMemento());
		
		System.out.println(ct.getCurrentState());
		System.out.println(ct.undo());
		System.out.println(ct.undo());
		System.out.println(ct.undo());
		System.out.println(ct.redo());
		
		
		
				
	}


}

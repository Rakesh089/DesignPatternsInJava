package Behavioural.command;

//invoker class
public class TVRemote {

	Command command;
	
	TVRemote(Command newCommand){
		this.command = newCommand;
	}
	
	public void press() {
		command.execute();
	}
}

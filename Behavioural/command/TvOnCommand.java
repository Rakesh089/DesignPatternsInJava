package Behavioural.command;

class TvOnCommand implements Command{

	Television telivision;
	
	TvOnCommand(Television newTelivision){
		this.telivision = newTelivision;
	}
	
	@Override
	public void execute() {
		telivision.tvOn();
	}

}

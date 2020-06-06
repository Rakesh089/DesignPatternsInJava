package Behavioural.command;

class TvVolUpCommand implements Command{

	Television telivision;
	
	TvVolUpCommand(Television newTelivision){
		this.telivision = newTelivision;
	}
	
	@Override
	public void execute() {
		telivision.volUp();
	}

}

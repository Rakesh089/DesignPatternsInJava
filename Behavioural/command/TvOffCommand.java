package Behavioural.command;

class TvOffCommand implements Command{

	Television telivision;
	
	TvOffCommand(Television newTelivision){
		this.telivision = newTelivision;
	}
	
	@Override
	public void execute() {
		telivision.tvOff();
	}

}
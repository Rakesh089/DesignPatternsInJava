package Behavioural.command;

class TvVolDownCommand implements Command{

	Television telivision;
	
	TvVolDownCommand(Television newTelivision){
		this.telivision = newTelivision;
	}
	
	@Override
	public void execute() {
		telivision.volDown();
	}

}

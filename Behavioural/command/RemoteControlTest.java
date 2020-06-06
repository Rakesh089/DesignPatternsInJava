package Behavioural.command;

public class RemoteControlTest {

	public static void main(String args[]) {
		
		Television tv = new Television(); 
		tv.tvOn();
		
		//TV ON
		TvOnCommand tvOnCommand = new TvOnCommand(tv);
		
		TVRemote remote = new TVRemote(tvOnCommand);
		remote.press();
		
		//TV OFF
		//TvOffCommand tvOffCommand = new TvOffCommand(new Television());
		
		remote = new TVRemote(new TvOffCommand(tv));
		remote.press();
		
		//TV vol up
		TvVolUpCommand tVolupCommand = new TvVolUpCommand(new Television());
		
		remote = new TVRemote(tVolupCommand);
		remote.press();
		remote.press();
		remote.press();
		
		
		//TV vol down
		TvVolDownCommand tVolDownCommand = new TvVolDownCommand(new Television());
		
		remote = new TVRemote(tVolDownCommand);
		remote.press();
		remote.press();
		
	}
}

package Behavioural.command;

//Receiver class
public class Television {
		
	private static int volume = 0;
	
	public void tvOn() {
		System.out.println("TV is On");
	}
	
	public void tvOff() {
		System.out.println("TV is Off");
	}
	
	public void volUp() {
		volume++;
		System.out.println("Vol is : " + volume);
	}
	
	public void volDown() {
		volume--;
		System.out.println("Vol is : " + volume);
	}
}
